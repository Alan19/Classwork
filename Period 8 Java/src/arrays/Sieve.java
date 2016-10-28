package arrays;

public class Sieve {

	public static void main(String[] args) {
		listPrimes(500);

	}

	private static void listPrimes(int limit) {
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit+1];
		for(int i = 0; i < limit+1; i++){
			numbers[i] = true;
		}
		//0 and 1 are, by definition, not prime
		numbers[0] = false;
		numbers[1] = false;
		//check all non-"crossed off" numbers (start with 2)
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
//				System.out.print("\n" + prime + " is prime. Crossing off ");
				for(int i = (int)Math.pow(prime, 2); i < limit+1; i += prime){
//					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		printThePrimes(numbers);
	}

	private static void printThePrimes(boolean[] numbers) {
		System.out.println("\nThe primes are: ");
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]){
				System.out.print(i + ", ");
			}
		}
	}

}
