package sort;

public class MainBattle {
	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with hydro pump");
		 squirtle.attack(bulbasaur, new Attack() {
			@Override
			public void attack(Pokemon target) {
				int newHP = target.getHP()/2;
				target.setHP(newHP);
			}
		});
		 bulbasaur.attack(squirtle, new Attack() {
			@Override
			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		 //Anonymous - No handle
		 //Inner - Passed to some other object
		 //Type
		 printScore(squirtle, bulbasaur);
	 }

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName() + "'s HP: " + p1.getHP());
		System.out.println(p2.getName() + "'s HP: " + p2.getHP());
	}
}
