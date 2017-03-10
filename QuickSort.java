/*****************************************************
 * class QuickSort
 * 
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *     qsort both halves of the 1st partition until given an array size 1
 * 2a. Worst pivot choice / array state and associated runtime: 
 *     pivots are at the ends in their final resting place n^2
 * 2b. Best pivot choice / array state and associated runtime:
 *     pivot's final resting place are in the middle of the parition nlogn
 * 3. Approach to handling duplicate values in array:
 *     nothing changed???
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    { 
	qsorth(d,0,d.length-1);
    }
    public static void qsorth(int[] arr, int left, int right){
	if(left < right){
	    int pvtpos = partition (arr, left, right, left+1);
	    qsorth(arr,left,pvtpos-1);
	    qsorth(arr,pvtpos + 1, right);
	}
    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.

    public static int partition ( int arr[], int a, int b, int c)
    {
	int v = arr[c];
	
	swap( c, b, arr);
	int s = a;
	
	for( int i = a; i < b; i++ ) {
	    if ( arr[i] <= v) {
		swap( i, s, arr );
		s++;}
	}
	swap(s,b,arr);
	
	return s;
    }

}//end class QuickSort
