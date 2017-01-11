package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class AnimatedComponent extends MovingComponent {

	private ArrayList<BufferedImage> frame; //the images that can be displayed
	private ArrayList<Integer> times; //the time each image is displayed
	private long displayTime; //the time when the last image switched
	private int currentFrame; //the frame that is currently being displayed
	private boolean repeat;
	
	public AnimatedComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		frame = new ArrayList<BufferedImage>();
		times = new ArrayList<Integer>();
		currentFrame = 0;
		repeat = true;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}
	
	public void addFrame(BufferedImage img, Integer time) {
		frame.add(img);
		times.add(time);
	}

	@Override
	public void checkBehaviors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawImage(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

}
