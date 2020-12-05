package exercise5;

public class Card {
	
	// Card value - 2D, 2C, 2H
	private String cardValue;

	public String getCardValue() {
		return cardValue;
	}

	public void setCardValue(String cardValue) {
		this.cardValue = cardValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardValue == null) ? 0 : cardValue.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj ==null)
			return false;
		Card card = (Card) obj;
		if (cardValue != card.cardValue)
			return false;
		return true;
	}
}
