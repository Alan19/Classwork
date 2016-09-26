package chatbot;

import java.util.Scanner;

public class ZhenMain {
	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	
	//List all the chatbots available under this class
	static Chatbot school;
	
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
		inMainLoop = true;
		while(true){
			println("Hi, " + user + ". How are you?");
			response = promptInput();
			if(findKeyword(response, "good,", 0) >= 0){
				println("That's wonderful. So glad you feel good.");
			}
			else if(response.indexOf("school") >= 0){
				println("School is great! Tell me about school.");
				
				//Exit while loop
				inMainLoop = false;
				//Go to the school's talk method
				school.talk();
			}
			else{
				println("I don't understand");
			}
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startPSN) {
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		
		int psn = searchString.indexOf(0);
		//Keep searching until context keyword foudn
		while(psn >= 0){
			//Assume preceeded and followed by space
			String before = "";
			String after = "";
			//Check character in front if it exists
			if(psn > 0){
				before = searchString.substring(psn - 1, psn);
			}
			//Check if there is a character afte the keyword
			if(psn + keyword.length() < searchString.length()){
				after = searchString.substring(psn =  keyword.length(), psn + keyword.length() + 1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return psn;
			}
			else{
				psn = searchString.indexOf(keyword, psn+1);
			}
		}
		return -1;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}
	
	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
		school = new ZhenSchool();
		
	}
	
	public static void println(String s){
		String printString = "";
		int cutoff = 500;
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
