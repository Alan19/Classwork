package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen implements MouseListener{

	public Button back;
	public Action action;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		Graphic mario = new Graphic(0, 0, .5, "resources/sampleImages/panorama_5.png");
		back = new Button(100, 100, 300, 100, "Click Me!", new Color(43, 83, 189), new Action() {
			
			@Override
			public void act() {
				MouseCoordinateGame.game.setScreen(MouseCoordinateGame.coordScreen);
			}
		});
		viewObjects.add(mario);
		viewObjects.add(back);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
		
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener() {
		return this;
	}

}
