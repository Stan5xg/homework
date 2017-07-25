package solitare;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;

import javax.xml.transform.Source;

public class Solitare extends Applet {
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];
//	static Card selected = null;
	static CardPile selectedSource = null;
	
	
	

	@Override
	public void init() {
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}
	

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint();
				return true;
			} 
		}
		return true;
	}

	public static boolean hasSelection() {
		return selectedSource != null;
	}

	public static void setSelection(CardPile pile) {
		pile.top().switchSelection();
		selectedSource = pile;
	}

	public static Card peekSelected() {
		if (!hasSelection()) {
			return null;
		}
		return selectedSource.top();
	}

	public static Card getSelected() {
		if (!hasSelection()) {
			return null;
		}
		Card selected = selectedSource.pop();
		selected.switchSelection();
		return selected;
	}

	public static void removeSelection() {
		if (hasSelection()) {
			selectedSource.top().switchSelection();
			selectedSource = null;
		}		
	}	
	

	
}
