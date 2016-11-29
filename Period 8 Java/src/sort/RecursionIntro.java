package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		System.out.println("Using a for loop:");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World");
		}
		System.out.println("Without using a for loop");
		forLoop(5, new Action() {
			private int value = 0;
			public void act() {
				System.out.println("Hello World! x" + value);
				value++;
			}
		});
		System.out.println("Factorial with recursion: 5! = " +factorial(5));
		hanoiSolution(3, "A", "B", "C");
	}

	private static int factorial(int i) {
		if(i <= 1) return 1;
		else{
			return i * factorial(i-1);
		}
	}

	private static void forLoop(int i, Action action) {
		if(i <= 0){
			return;
		}
		else{
			action.act();
			forLoop(i-1, action);
		}
	}

	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg) {
		if (numberOfDiscs <= 1) {
			System.out.println("Move " + startPeg + " to " + endPeg);
		}
		else {
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
