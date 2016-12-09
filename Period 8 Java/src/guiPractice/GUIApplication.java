package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class GUIApplication extends JFrame{
	
	private Screen currentScreen;
	
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

	/**
	 * method for creating and setting the starting screen
	 */
		
	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		currentScreen = screen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
