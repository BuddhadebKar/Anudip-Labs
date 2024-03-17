package practice;

public class Child2 extends Child1{
	void m3() {
		System.out.println("I am method of child 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj = new Child2();
		obj.m3();
		obj.m2();
		obj.m1();
	}

}
