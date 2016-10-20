package arrays;

public class AdvancedArrayMethods {

	static int[] array;
	public static void main(String[] args) {
//		array = new int[100];
//		int[] someArray = new int[50];
//		copyArray(array, someArray);
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		swap(array, 0, array.length - 1);
	}
	private static void swap(String[] arr, int a, int b) {
		String temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
		
	}
	private static void copyArray(int[] original, int[] target) {
		if(original.length == target.length){
			for (int i = 0; i < original.length; i++) {
				target[i] = original[i];
			}
		}
		else{
			//error message
			System.out.println("ERROR: Tried to copy arrays of 2 different lengths.");
		}
	}

}
