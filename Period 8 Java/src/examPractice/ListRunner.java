package examPractice;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppingList;
	
	public static void main(String[] args){
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static String[] getDescriptions() {
		String[] test = {"Coffee", "Video Games", "Potato Chips", "A Life"};
		return test;
	}
	
	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();//1 point
		for (String s : justDescriptions) {//.5 point
			shoppingList.add(new Item(s));//.5 adding, 1 point creating item
		}
	}
	
	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static void printPurchasedItems() {
		for (int i = 0; i < shoppingList.size(); i++) {
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.remove(i).getDescription());
				i--;
			}
		}
	}
	
}
