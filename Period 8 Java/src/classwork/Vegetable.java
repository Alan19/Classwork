package classwork;

public class Vegetable extends Food {

	public Vegetable(String name, int calories) {
		super(name, calories);
	}

	public void printCalories(){
		System.out.println("This vegetable has " + this.getCalories() + " calories");
	}
	
	public void healthInformation(){
		super.healthInformation();
		System.out.println("A vegetable is a healthy food");
	}
}
