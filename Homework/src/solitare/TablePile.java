package solitare;

import java.awt.Graphics;

class TablePile extends CardPile {

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
		// don't test bottom of card
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty) {
		if (Solitare.selected == null) {
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
		
//		if (empty()) {
//			return;
//		}
//
//		// if face down, then flip
//		Card topCard = top();
//		if (!topCard.isFaceUp()) {
//			topCard.flip();
//			return;
//		}
//
//		// else see if any suit pile can take card
//		topCard = pop();
//		for (int i = 0; i < 4; i++) {
//			if (Solitare.suitPile[i].canTake(topCard)) {
//				Solitare.suitPile[i].push(topCard);
//				return;
//			}
//		}
//		// else see if any other table pile can take card
//		for (int i = 0; i < 7; i++) {
//			if (Solitare.tableau[i].canTake(topCard)) {
//				Solitare.tableau[i].push(topCard);
//				return;
//			}
//		}
//		// else put it back on our pile
//		push(topCard);
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}