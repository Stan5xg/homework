package solitare;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.util.Iterator;

public class Tester extends Applet{
//	Card card;
	static DiscardPile discardPile;
	
	
	@Override
	public void init() {
		//card = new Card(1, 10);
		discardPile = new DiscardPile(268, 5);
	}
	
	@Override
	public void paint(Graphics g) {
		discardPile.display(g);
	}
	
	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		discardPile.includes(x, y);
		discardPile.select(x, y);
		
		repaint();
		return true;
	}

}
