package sort;

public class Pokemon {
	@SuppressWarnings("unused")
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else {
			System.out.println("The attack missed");
		}
	}
	
	public Pokemon(String name, int level){
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}


	public void iChooseYou() {
		System.out.println(name + ", " + name + "!");
	}
	
	public int getHP(){
		return hp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		this.hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	
	public void lapse(){
		if(this.poisoned) 
			this.hp -= 15;
	}
}
