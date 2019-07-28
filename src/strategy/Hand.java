package strategy;

public class Hand {

	public static final int HANDVALUE_GU = 0;
	public static final int HANDVALUE_CHO = 1;
	public static final int HANDVALUE_PAA = 2;
	public static final Hand[] hand = {

			new Hand(HANDVALUE_GU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA)

	};

	private static final String[] name = {

			"ぐー","チョキ","パー"

	};

	private int handValue;
	private Hand(int handValue) {

		this.handValue = handValue;

	}

	public static Hand getHand(int handValue) {

		return hand[handValue];

	}

	public boolean isStrongerThan(Hand h) {

		return fight(h) == 1;

	}

	public boolean isWeakerThan(Hand h) {

		return fight(h) == -1;

	}

	private int fight(Hand h) {

		if(this == h) {

			return 0;

		}else if((this.handValue + 1) % 3 == h.handValue) {

			return 1;

		}else {

			return -1;

		}

	}

	public String toString() {

		return name[handValue];

	}

}
