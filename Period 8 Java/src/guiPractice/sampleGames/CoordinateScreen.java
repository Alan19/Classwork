package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.AnimatedComponent;
import guiPractice.components.Button;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	private ClickableGraphic interactiveImage;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
//		label = new TextLabel(40, 45, width, 40, "");
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
//		label = new TextLabel(40, 45, 760, 40, "Sample Text");
//		paragraph = new TextArea(40, 85, 760, 500, "Morbi vitae convallis magna, sed commodo ante. Nulla semper dignissim eros dictum vehicula.");
//		button = new Button(100, 400, 100, 50, "Click Me!", new Color(100, 150, 200), new Action() {
//			
//			@Override
//			public void act() {
//				MouseCoordinateGame.game.setScreen(MouseCoordinateGame.myScreen);
//			}
//		});
//		picture = new Graphic(200, 200, .2, "resources/sampleImages/panorama_3.png");
		
//		MovingComponent mc = new MovingComponent(30, 60, 80, 80);
//		interactiveImage = new ClickableGraphic(200, 200, "resources/sampleImages/panorama_3.png");
//		viewObjects.add(picture);
//		viewObjects.add(label);
//		viewObjects.add(paragraph);
//		viewObjects.add(button);
//		viewObjects.add(interactiveImage);
//		viewObjects.add(mc);
		
//		MovingComponent movingComponent = new MovingComponent(30, 60, 80, 80);
		addAnimation(viewObjects);
				
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent(40, 50, 150, 150);
		try {
			int numberInRow = 8;
			int rows = 2;
			int w = 105;
			int h = 140;
			ImageIcon icon = new ImageIcon("resources/sampleImages/Sprite Sheet.png");
			//create a for loop that will take a "sub-image" from the sprite grid
			for(int i = 0; i < numberInRow * rows; i++){
				BufferedImage cropped = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				//declare the "cropped image
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, w, h, x1, y1, x1+w, y1+h, null);
				a.addFrame(cropped, 20);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
	}

	@Override
	public void mouseDragged(MouseEvent m) {
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
//		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		if(button.isHovered(e.getX(), e.getY()));
//			button.act();
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
