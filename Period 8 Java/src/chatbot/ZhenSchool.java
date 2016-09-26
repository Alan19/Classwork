package chatbot;

public class ZhenSchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	@Override
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			//Static call on promptInput method from main class
			ZhenMain.println("Type 'quit' to go back");
			schoolResponse = ZhenMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				ZhenMain.promptForever();
			}
			ZhenMain.println("That's my favorite part about school too!");
		}
	}

}
