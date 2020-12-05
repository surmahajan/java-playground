package exercise5;

import java.util.List;

public interface PlayCard {
	
	List<Card> shuffle(List<Card> cards);
	
	Card dealCard(List<Card> deck);

}
