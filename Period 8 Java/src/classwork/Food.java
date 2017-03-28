package classwork;

public class Food {

	private String name;
	private int calories;

	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public void printCalories(){
		System.out.println("This food has " + calories + " calories");
	}
	
	public void healthInformation(){
		System.out.println("I am a " + name);
		printCalories();
	}
}
