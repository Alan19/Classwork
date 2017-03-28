package classwork;

public class Vegetable extends Food {

	private int calories;

	public Vegetable(String name, int calories) {
		super(name, calories);
		this.calories = calories;
	}

	public void printCalories(){
		System.out.println("This vegetable has " + calories + " calories");
	}
	
	public void healthInformation(){
		super.healthInformation();
		System.out.println("A vegetable is a healthy food");
	}
}
