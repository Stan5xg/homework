package solitare;

import java.awt.Color;
import java.awt.Graphics;

class TablePile extends CardPile {

	private static final int OFFSET = 35;

	private Card selected = null;
	private int yMax;
	private int selectionTop;

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
		return (aCard.getColor() != topCard.getColor()) && (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty && ty <= yMax;
	}

	@Override
	public void select(int tx, int ty) {
		CardPile selected = Solitare.selected;
		System.out.println(selected);
		if (!takeCards(selected)) {
			selectCards(ty);
		}
//		takeCards(selected);
	}

	private void selectCards(int ty) {
		int yCurr = yMax - Card.height;
		Card curr = top();
		while(ty < yCurr && curr != null) {
			curr = curr.link;
			yCurr -= OFFSET;
		}
		if (curr.isFaceUp()) {
			selected = curr;
			selectionTop = yCurr;			
		}
	}

	private boolean takeCards(CardPile selected) {
		if (selected == null) {
			return false;
		}
		Card selectedCard = selected.getSelectedCard();
		if (selectedCard == null) {
			return false;
		}
		if (canTake(selectedCard)) {
			CardPile buffer = new CardPile(0, 0);
			Card curr;
			do {
				curr = selected.pop();
				buffer.push(curr);
			} while (curr != selectedCard && !selected.empty());

			while (!buffer.empty()) {
				push(buffer.pop());
			}
			return true;
		}
		return false;
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		if (aCard == top()) {
			yMax = localy + Card.height;
			if (!aCard.isFaceUp()) {
				aCard.flip();
			}
		} 
		aCard.draw(g, x, localy);
		return localy + OFFSET;
	}
	
	@Override
	public Card getSelectedCard() {
		return selected;		
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
		drawSelection(g);
	}

	private void drawSelection(Graphics g) {
		if (isSelected()) {
			g.setColor(Color.red);
			int rectHeight = yMax - selectionTop;
			g.drawRect(x - 3, selectionTop - 3, Card.width + 6, rectHeight + 6);
		} else {
			selected = null;
		}
	}

}