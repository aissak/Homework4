
/* 
 * @date: 10/31/2019
 * 
 */
public class GenericInsertionSort {

	// Geneticinsertionsort method
	public static <T extends Comparable> void GenericInsertionSort(T[] list) {
	      // Find the minimum in the list[i..list.length-1]
		for (int i = 1; i < list.length; i++) {
			
			// Swap list[i] with list[i + 1]
			T currentElement = list[i];
			//for loop
			int k;
			for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
				list[k + 1] = list[k];
			}

			// Insert the current element into list[k+1]
			list[k + 1] = currentElement;
		}
	}//end of genetic
}//end class