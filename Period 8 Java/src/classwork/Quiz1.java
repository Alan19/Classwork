package classwork;

import java.util.Scanner;

public class Quiz1 {
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	static Scanner input = new Scanner(System.in);
	
	//1 point: visibility private
	//1 point for data type declaration(throughout)
	private static String userName = "test_user";
	private static String password = "test";
			
	//1 point correct method
	public static void main(String[] args){
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown username, please contact the network administrator.");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			//1 point for using waitForEntry() correctly
			if(waitForEntry().equals(password)){
				//.5 points for correct number
				System.out.println("Authenication Successful");
				inLoop = false;
			}
			else{
				triesRemaining--;
				//.5 triesRemaining is changing
				if(triesRemaining == 0){
					//.5 points for printing invalid password 
					System.out.println("Invalid password. Please re-enter username");
					//.5 points for 3 tries
					inLoop = false;
				}
				else{
					System.out.println("Invalid input. You have " + triesRemaining + " attmept(s) left");
				}
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter a username");
		//1 point for comparing strings
		return waitForEntry().equals(userName);
	}
}
