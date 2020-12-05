package exercise5;

import java.util.*;

public class PlayCardImpl implements PlayCard {

	@Override
	public List<Card> shuffle(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}

	@Override
	public Card dealCard(List<Card> deck) {
		Optional<Card> optionalCard = deck.stream().findFirst();
		Card card = optionalCard.get();
		deck.remove(card);
		return card;
	}
	

}
