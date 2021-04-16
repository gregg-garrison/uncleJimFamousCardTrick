package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import components.Card;
import components.Deck;

public class Test1 {

	public static void main(String[] args) {
		Deck d = new Deck();
		Collections.shuffle(d.getDeck());

		List<Card> fullDeck = d.getDeck();
		List<Card> firstHalf = new ArrayList<>();
		List<Card> secondHalf = new ArrayList<>();

		for (int i = 0; i < fullDeck.size(); i++) {
			if (i < 26) {
				firstHalf.add(fullDeck.get(i));
			} else {
				secondHalf.add(fullDeck.get(i));
			}
		}

//		printDeck(fullDeck);
		Card c7 = fullDeck.get(6);

		System.out.println("\n\nMagic Card: " + c7 + "\n");

		Card firstDraw = draw(secondHalf);
		Card secondDraw = draw(secondHalf);
		Card thirdDraw = draw(secondHalf);

		int num = firstDraw.getValue() + secondDraw.getValue() + thirdDraw.getValue();

		int index = num - secondHalf.size() - 1;

		Card dealerGuess = firstHalf.get(index);

		System.out.println("\nDealer's Guess: " + dealerGuess);

	}

	public static Card draw(List<Card> cards) {
		Card c = cards.remove(0);
		System.out.println(c);
		int counter = 0;
		int n = 10 - c.getValue();
		while (counter < n) {
			cards.remove(0);
			counter++;
		}
		return c;
	}

	public static void printDeck(List<Card> d) {
		for (int i = 0; i < d.size(); i++) {
			if (i > 0 && i % 4 == 0) {
				System.out.println();
			}
			System.out.print(d.get(i) + " | ");
		}
	}

}
