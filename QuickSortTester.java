/** QuickSortTester.
 *
 * ALGORITHM:
 *
 * BIG-OH CLASSIFICATION OF ALGORITHM:
 * 
 *
 * Mean execution times for dataset of size n:
 *  
 *
 * ANALYSIS:
 
Length            Time (nanoseconds)
1245               63051
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
1264               62882
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
1292               63811
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ javac QuickSortTester.java 
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
2058              105920
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
2044              105788
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ javac QuickSortTester.java 
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
3252              170645
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
3432              181040
allard.peng@cslab3-25:~/Desktop/myHWs/lab01$ java QuickSortTester 
Running 10000 rounds of testing.

Length            Time (nanoseconds)
3311              176324

 */

public class QuickSortTester {
    private static final long ROUNDS = 10000;
    private static final int    SIZE = 3000 + (int)( Math.random() * 1000 );

    /** Execution time analysis.
     * Create an array of size SIZE and populate it with arbitary values and
     * run merge sort on the array. Repeat ROUNDS times, then divide the total
     * amount of time spent by ROUNDS to obtain the average.
     */
    public static void main( String[] args ) {
        System.out.println("Running " + ROUNDS + " rounds of testing.\n");
        System.out.format("%s%30s%n", "Length", "Time (nanoseconds)");

        long time = 0;
        long s = 0;
        long e = 0;
        int[] data = new int[SIZE];

        for ( long rounds = ROUNDS; rounds > 0; rounds-- ) {
            for ( int i = 0; i < data.length; i++ ) {
                data[i] = (int) ( 1000 * Math.random() );
            }
            s = System.nanoTime();
            QuickSort.qsort(data);
            e = System.nanoTime();

            time += (e - s);
        }
        System.out.format("%s%20s%n", data.length, time / ROUNDS);
    }
}
