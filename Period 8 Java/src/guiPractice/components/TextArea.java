package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}

	FontMetrics fm = g.getFontMetrics();
	
	@Override
	public void update(Graphics2D g) {
		String text = this.getText();
		String[] words = text.split(" ");
		int screenWidth = getWidth();
		int currentLineWidth = 0;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		String font = super.getFont();
		int size = super.getSize();
		if (text != null) {
			g.setFont(new Font(font, Font.PLAIN, size));
			g.drawString(text, 4, getHeight()-5);			
		}
		for (int i = 0; i < words.length; i++) {
			if(fm.stringWidth(words[i]) + currentLineWidth > screenWidth){
				
			}
		}
	}

}
