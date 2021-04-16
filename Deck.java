package components;

import java.util.*;

public class Deck {

	private List<Card> deck = new ArrayList<>();
	@SuppressWarnings("unused")
	private int currentCard;
	@SuppressWarnings("unused")
	private int n;

	public Deck() {
		for (int i = 1; i <= 13; i++) {
			for (int j = 0; j < 4; j++) {
				Card card = new Card(i, j);
				deck.add(card);
			}
		}
	}

	public Deck(int n) {
		int counter = 0;
		while (counter < n) {
			for (int i = 1; i <= 13; i++) {
				for (int j = 0; j < 4; j++) {
					Card card = new Card(i, j);
					deck.add(card);
				}
			}
			counter++;
		}

	}

	public List<Card> getDeck() {
		return deck;
	}

	public Card drawCard() {
		return deck.remove(0);
	}

	public Card drawCard(int index) {
		return deck.remove(index);
	}

}
