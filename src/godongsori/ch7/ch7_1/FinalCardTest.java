package godongsori.ch7.ch7_1;

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num) {
		super();
		KIND = kind;
		NUMBER = num;
	}

	Card() {
		this("HEART", 1);
	}

	@Override
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		// c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}

}
