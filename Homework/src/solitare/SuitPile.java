package solitare;

import java.awt.Graphics;

class SuitPile extends CardPile {

	SuitPile(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void select(int tx, int ty) {
		if (Solitare.selected != null) {
			Card selectedCard = Solitare.selected.getSelectedCard();
			if (canTake(selectedCard) && selectedCard == Solitare.selected.top()) {
				this.push(Solitare.selected.pop());
			}
		}
	}

	@Override
	public boolean canTake(Card aCard) {
		if (aCard == null) {
			return false;
		}
		if (empty()) {
			return aCard.getRank() == 0;
		}
		Card topCard = top();
		return (aCard.getSuit() == topCard.getSuit())
				&& (aCard.getRank() == 1 + topCard.getRank());
	}
	
	@Override
	public void display(Graphics g) {
		super.display(g);
		drawSelectionRect(g);
	}
}