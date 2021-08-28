
public class JavaInsertionSort {
	
	public static void insertionSort(int arr[]) {
		
		/**
		 * Initially arr[0] index is sorted, that we considered.
		 * 
		 * */
		
		for (int i=1; i<arr.length; i++) {
			// first loop is for incremental
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				// second loop is for decremental
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = temp;
		}
	}
	
	public static void showArray(int arr[]) {
		System.out.println("\n");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int arr[] = {5, 4, 10, 1, 6, 2};
		System.out.print("Before Sorted: ");
		showArray(arr);
		insertionSort(arr);
		System.out.print("After Sorted: ");
		showArray(arr);
	}

}
