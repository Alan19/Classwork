package sort;

public class RecursionIntro {

	public static void main(String[] args) {
//		System.out.println("Using a for loop:");
//		for(int i = 0; i < 5; i++){
//			System.out.println("Hello World");
//		}
//		System.out.println("Without using a for loop");
//		forLoop(5, new Action() {
//			private int value = 0;
//			public void act() {
//				System.out.println("Hello World! x" + value);
//				value++;
//			}
//		});
//		System.out.println("Factorial with recursion: 5! = " +factorial(5));
//		hanoiSolution(4, "A", "B", "C");
		int n = 10;
		System.out.println("The " + n + "th Fibonacci is " + fibonacci(n));
	}

	private static int fibonacci(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			int previous = fibonacci(n-1);
//			print("Before we find fibonacci " + n + " we need to find fibonacci " + (n-1) + ", which is " + previous);
			int beforePrevious = fibonacci(n-2);
			return previous + beforePrevious;
		}
	}

	@SuppressWarnings("unused")
	private static int factorial(int i) {
		if(i <= 1) return 1;
		else{
			return i * factorial(i-1);
		}
	}

	@SuppressWarnings("unused")
	private static void forLoop(int i, Action action) {
		if(i <= 0){
			return;
		}
		else{
			action.act();
			forLoop(i-1, action);
		}
	}

	private static int count = 1;
	public static void print(String s){
		System.out.println("Move #" + count + ":" + s);
		count++;
	}
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg) {
		if (numberOfDiscs <= 1) {
			print("Move " + startPeg + " to " + endPeg);
		}
		else {
			System.out.println("In order to move " + numberOfDiscs + " over to peg " + endPeg + ", we must move " + (numberOfDiscs-1) + " to " + midPeg + " first.");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
