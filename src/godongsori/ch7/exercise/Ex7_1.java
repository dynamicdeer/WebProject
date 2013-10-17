package godongsori.ch7.exercise;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 1; i <= cards.length / 2; i++) {
			if (i == 1 || i == 3 || i == 8) {
				cards[i-1] = new SutdaCard(i, true);
			}else{
				cards[i-1] = new SutdaCard(i, false);
			}
		}
		for (int i = 1; i <= cards.length / 2; i++) {
			cards[i+9] = new SutdaCard(i, false);
		}
	}
	
	SutdaCard pick(int index){
		return cards[index];
	}
	
	SutdaCard pick(){
		int index = (int)(Math.random()*20);
		return cards[index];
	}

	void shuffle(){
		for (int i = 0; i < cards.length; i++) {
			int index = (int)(Math.random()*20);
			SutdaCard temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}

class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
