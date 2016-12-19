package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
//		label = new TextLabel(40, 45, width, 40, "");
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40, 85, 760, 500, "Fusce a enim nec felis rhoncus porta sed ut justo. Maecenas nisl elit, maximus sit amet scelerisque et, laoreet ac turpis. Nam eget neque erat. Ut vitae placerat magna. Suspendisse et metus ut turpis tristique dictum a vel elit. Donec rutrum hendrerit luctus. Ut molestie, urna sed molestie sodales, nisl massa consectetur turpis, ut dignissim nunc ligula sit amet augue. Ut quis rutrum augue. Donec porttitor venenatis justo vitae bibendum. Praesent venenatis ligula efficitur mauris imperdiet interdum. Morbi vitae convallis magna, sed commodo ante. Nulla semper dignissim eros dictum vehicula.");
		button = new Button(100, 400, 100, 50, "Click Me!", new Color(100, 150, 200), new Action() {
			
			@Override
			public void act() {
				System.out.println("You clicked me!");
			}
		});
		picture = new Graphic(200, 200, .2, "resources/sampleImages/panorama_3.png");
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
	}

	@Override
	public void mouseDragged(MouseEvent m) {
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
