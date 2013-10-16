package godongsori.ch7.ch7_1;

class A{
	public void methodA(){
		I i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I{
	public abstract void methodB();
}

class B implements I{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}

class InstanceManager{
	public static I getInstance(){
		return new B();
	}
}