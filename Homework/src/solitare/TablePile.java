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
		return (aCard.getColor() != topCard.getColor()) && (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty && ty <= yMax;
	}

	@Override
	public void select(int tx, int ty) {
		clickY = ty;
		System.out.println("-1");
		if (Solitare.selected == null) {
			return;
		}

		CardPile selected = Solitare.selected;
		Card selectedCard = selected.getSelectedCard();
		System.out.println(selectedCard.getColor() + " " + selectedCard.getRank() + " " + selectedCard.getSuit());
		System.out.println(canTake(selectedCard));
		if (canTake(selectedCard)) {
			System.out.println("1");
			CardPile buffer = new CardPile(0, 0);
			System.out.println("2");
			Card curr;
			System.out.println("3");
			do {
				curr = selected.pop();
				buffer.push(curr);
			} while (curr != selectedCard && !selected.empty());
			System.out.println("4");

			while (!buffer.empty()) {
				push(buffer.pop());
			}
			System.out.println("5");

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
			if (!aCard.isFaceUp()) {
				aCard.flip();
			}
		} else {
			yMax = localy + OFFSET;
		}

		if (clickY >= localy && clickY <= yMax && aCard.isFaceUp()) {
			selected = aCard;
			rectTop = localy;
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
		if (isSelected()) {
			g.setColor(Color.red);
			int rectHeight = rectBottom - rectTop;
			g.drawRect(x - 3, rectTop - 3, Card.width + 6, rectHeight + 6);
		} else {
			selected = null;
		}
	}

}