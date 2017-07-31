package solitare;

import java.awt.Color;
import java.awt.Graphics;

class TablePile extends CardPile {

	private static final int OFFSET = 35;
	
	
	private Card selected = null;
	private int yMax;
	
	private int clickY = 0;
	
	private int rectTop = 0;
	private int rectBottom = 0;
	

	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitare.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.getRank() == 12;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor())
				&& (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty && ty <= yMax;
	}

	@Override
	public void select(int tx, int ty) {
		if (Solitare.selected == null) {
			return;
		}
		
		if (isSelected()) {
//			clickX = tx;
			clickY = ty;
			return;
		}
		
		
		CardPile selected = Solitare.selected;
		Card selectedCard = selected.getSelectedCard();
		if (canTake(selectedCard)) {
			CardPile buffer = new CardPile(0, 0);
			Card curr; 
			do { 
				curr = selected.pop();
				buffer.push(curr);
			} while(curr != selectedCard && !selected.empty());
				
			while(!buffer.empty()) {
				push(buffer.pop());
			}
			
		}
		
	}


	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		
		if (aCard == top()) {
			yMax = localy + Card.height;
			rectBottom = yMax;
		} else {
			yMax = localy + OFFSET;
		}
		
		if (clickY >= localy && clickY <= yMax) {
			selected = aCard;
			rectTop = localy;
		}
		
		aCard.draw(g, x, localy);
		return localy + OFFSET;
	}

	@Override
	public void display(Graphics g) {
		System.out.println(selected);
		stackDisplay(g, top());
		if (isSelected()) {
			g.setColor(Color.red);
			int rectHeight = rectBottom - rectTop;
			g.drawRect(x - 3, rectTop - 3, Card.width + 6, rectHeight + 6);
		}
	}

}