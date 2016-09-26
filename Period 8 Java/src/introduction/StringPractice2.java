package introduction;

import java.util.Scanner;

public class StringPractice2 {
	
	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		promptName();
		promptForever();
	}
	
	public static void promptName() {
		println("Enter your name");
		user = input.nextLine();
		println("Glad to meet you " + user + ".For the rest of time, I will always call you " + user + ".You may call me computer. We should become friends.");
	}

	public static void promptForever() {
		while(true){
			promptInput();
		}
	}
	
	public static void promptInput() {
		println("Please type something " + user);
		String userInput = input.nextLine();
		println("Congratulations! You typed: " + userInput);
	}
	
	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
		
	}
	
	public static void println(String s){
		String printString = "";
		int cutoff = 40;
		//Check for words to add or s has a length > 0
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
			//Check to see if the next word will fit on the line AND there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				//Adds the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
				//Identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//If there are no more spaces, this is the last word so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += cut + "\n";
		}
		
		System.out.println(printString);
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World");
		String text2 = "Hello World";
		
		if(text1.equals(text2)){
			System.out.println("These strings are equal");			
		}
		println(text1);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			println("Word 1 comes before Word 2");
		}
	}
}
