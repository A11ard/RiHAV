/** QuickSortTester.

Average: Run the timer on a random array of random length. 

Best: Run the timer many times, take the fastest, as this probably approaches a "best case"

Worst: Presort the array. Then run the timer. 

 */

public class QuickSortTester {
    private static final long ROUNDS = 10000;
    private static final int    SIZE = 1000 + (int)( Math.random() * 1000 );

    /** Execution time analysis.
     * Create an array of size SIZE and populate it with arbitary values and
     * run merge sort on the array. Repeat ROUNDS times, then divide the total
     * amount of time spent by ROUNDS to obtain the average
     */
    
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }
    public static void printArr( long[] a ) {
	for ( long o : a )
	    System.out.print( o + " " );
	System.out.println();
    }
    public static int factorial(int n){
	if(n == 1) return 1;
	else return (n * factorial(n-1)); 
    }
    
    public static void main( String[] args ) {
        System.out.println("Running " + ROUNDS + " rounds of testing.\n");
        System.out.format("%s%30s%n", "Length", "Time (nanoseconds)");

        long time = 0;
        long s = 0;
        long e = 0;
        int[] data = new int[SIZE];

	//this is for testing best case
	int[] a = new int[8]; 
	long[] stored = { 987654321, 987654321, 987654321 };
	long TIME = 0; 

        for ( long rounds = ROUNDS; rounds > 0; rounds-- ) {
            for ( int i = 0; i < data.length; i++ ) {
                data[i] = (int) ( 1000 * Math.random() );
            }
	    
            //if you want to make the array the worst case (first sort the array) UNCOMMENT THE NEXT LINE 
	    QuickSort.qsort(data);//sort the array before running the qsort algo
	    
            s = System.nanoTime();
            QuickSort.qsort(data);
            e = System.nanoTime();

            time += (e - s);
        }

 	//for best case, there doesnt seem to be a way to just construct a best case array. Therefore, I'll use an array of length n and test it n! * 100 times. Since an array of size n has n! combinations for elements, and only 1 or 2 configurations are best case, I'll run it n! * 100 times, and take the fastest 1%, assuming that those are closer to best case
	/*       for(int i = 0; i < (factorial(a.length) ); i++){
 
	    shuffle(a);
	    
            s = System.nanoTime();
            QuickSort.qsort(data);
            e = System.nanoTime();

            TIME = (e - s);

	    if(TIME < stored[0]) stored[0] = TIME;
	    else if(TIME < stored[1]) stored[1] = TIME;
	    else if(TIME < stored[2]) stored[2] = TIME;
	    else ; 
	}
	System.out.println(a.length + "  |  ");
	printArr(stored);*/ 	
	//=========================================================END OF THE BEST CASE TEST 
	
        System.out.format("%s%20s%n", data.length, time / ROUNDS);
    }
}
