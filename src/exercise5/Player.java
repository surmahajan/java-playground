package exercise5;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private int Id;
	
	// Player or Dealer
	private PlayerType playerType;
	
	// Cards with the player
	private List<Card> cards = new ArrayList<Card>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((playerType == null) ? 0 : playerType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (Id != other.Id)
			return false;
		if (playerType != other.playerType)
			return false;
		return true;
	}
	
	

}
