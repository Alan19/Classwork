package arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		int[] fiftyNumbers = new int[50];
		//populate(fiftyNumbers);
		//randomize(fiftyNumbers);
		rollDice(fiftyNumbers, 3);
	}
	
	private static void countResult(int[] array, int numberOfDice) {
		//Counts each die roll and provide a percentage
		int[] counter = new int[numberOfDice * 6];
		for(int n: array){
			counter[n-1]++;
		}
		for(int i = numberOfDice - 1; i < counter.length; i++){
			System.out.println((i+1) + " was rolled " + 100 * counter[i] / array.length+ " percent of the time");
		}
	}

	private static void rollDice(int[] array, int numberOfDice) {
		for(int i = 0; i < array.length; i++){
			int sum = 0;
			for(int j = 0; j < numberOfDice; j++){
				sum += randomInteger(6)+1;							
			}
			array[i] = sum;
		}
		countResult(array, numberOfDice);
	}

	private static void print(int[] array) {
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}

	@SuppressWarnings("unused")
	private static void randomize(int[] array) {
		for(int i = 0; i < 50; i++){
			array[i] = randomInteger(25);
		}
		print(array);
	}

	@SuppressWarnings("unused")
	private static void populate(int[] array) {
		for(int i = 0; i < 50; i++){
			array[i] = i + 1;
		}
		print(array);
	}

	private static int randomInteger(int max){
		//Returns a integer from [0,end)
		return (int)(Math.random() * max);
	}
}
