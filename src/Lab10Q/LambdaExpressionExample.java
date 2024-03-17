package Lab10Q;

public class LambdaExpressionExample {
	interface1 ref = (int a, int b)->{
		System.out.println("Addition of two number : "+(a+b));
	};
	interface1 ref2 = (int a, int b)->{
		System.out.println("Subtraction of two number : "+(a-b));
	};
	interface1 ref3 = (int a, int b)->{
		System.out.println("Multiplecation of two number : "+(a*b));
	};
	interface1 ref4 = (int a, int b)->{
		System.out.println("Division of two number : "+(a/b));
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExpressionExample obj = new LambdaExpressionExample();
		obj.ref.math(10,2);
		obj.ref2.math(10,2);
		obj.ref3.math(10,2);
		obj.ref4.math(10,2);
	}

}
