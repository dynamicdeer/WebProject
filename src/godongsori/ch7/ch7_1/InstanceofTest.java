package godongsori.ch7.ch7_1;

class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
	}

}

class Car {}
class FireEngine extends Car {}