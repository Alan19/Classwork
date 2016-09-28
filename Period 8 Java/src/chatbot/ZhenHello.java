package chatbot;

public class ZhenHello implements Chatbot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponse = {"We already said hello", "You said hello already"};
	private String[] angryResponse = {"Seriously, stop", "What is wrong with you and saying hello?"};
	
	private int helloCount = 0;
	
	public ZhenHello(){
		helloCount = 0;
	}
	
	@Override
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount ++;
			printResponse();
			helloResponse = ZhenMain.promptInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				ZhenMain.promptForever();
			}
		}
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int)(Math.random() * angryResponse.length);
			ZhenMain.println(angryResponse[responseSelection]);
		}
		else{
			int responseSelection = (int)(Math.random() * calmResponse.length);
			ZhenMain.println(calmResponse[responseSelection]);
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		if(ZhenMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;			
		}
		if(ZhenMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;			
		}
		if(ZhenMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;			
		}
		return false;
	}

}
