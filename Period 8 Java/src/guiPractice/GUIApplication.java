package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GUIApplication extends JFrame{
	
	private Screen currentScreen;
	
	//main method for practice only
	public static void main(String[] args) {
		new GUIApplication();
		
	}

	public GUIApplication(){
		//Terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int x = 40;
		int y = 40;
		int width = 970;
		int height = 600;
		setBounds(x, y, width, height);
		initScreen();
		setVisible(true);
	}

	protected void initScreen() {
		Screen startScreen = new Screen(getWidth(), getHeight());
		currentScreen = startScreen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
