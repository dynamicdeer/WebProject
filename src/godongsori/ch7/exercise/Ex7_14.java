package godongsori.ch7.exercise;

class SutdaCard1{
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard1(){
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	public String toString(){
		return NUM + (IS_KWANG ? "K" : "");
	}
}

class Ex7_14 {
	public static void main(String[] args) {
		SutdaCard1 card = new SutdaCard1(1, true);
	}

}
