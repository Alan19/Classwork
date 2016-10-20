package arrays;

public class AdvancedArrayMethods {

	static int[] array;
	public static void main(String[] args) {
		array = new int[100];
		int[] someArray = new int[50];
		copyArray(array, someArray);
	}
	private static void copyArray(int[] original, int[] target) {
		if(original.length == target.length){
			for (int i = 0; i < original.length; i++) {
				target[i] = original[i];
			}
		}
	}

}
