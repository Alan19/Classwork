package sort;

public class SortingAlgorithms {

	public static int[] array = {1, 6, 4, 3, 2, 7};
	public static void main(String[] args) {
		System.out.println(quickSort(array, 0, 6));

	}

	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
//		System.out.println(array.toString());
	}
	
	public static void quickSort(int[] arr, int start, int end){
		if(start > end){
		}
		else{			
			partitionArray(arr, start, end);
		}
	}

	private static int partitionArray(int[] arr, int start, int end) {
		int pIndex = 0;
		int pivot = arr[end-1];
		for (int i = 0; i < end-1; i++) {
			if (arr[i] <= pivot) {
				swap(arr, arr[i], pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, arr[end-1]);
		return pIndex;
	}
}
