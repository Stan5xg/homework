package solitare;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;

public class Tester extends Applet{
	Card card;
	
	@Override
	public void init() {
		card = new Card(1, 10);
	}
	
	@Override
	public void paint(Graphics g) {
		card.draw(g, 10, 10);
	}
	
	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		card.select();
		
		repaint();
		return true;
	}

}
