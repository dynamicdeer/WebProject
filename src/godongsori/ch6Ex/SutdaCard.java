package godongsori.ch6Ex;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	public SutdaCard() {
		this(1, true);
	}
	
	String info(){
		return num + (isKwang? "K" : "");
	}
}
