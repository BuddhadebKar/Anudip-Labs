package Lab10Q2;

import Lab10Q.interface1;

public class StringManipulate {
	interfaceEx ref = (String x)->{
		System.out.println("To upper case : "+x.toUpperCase());
		return x;
	};
	interfaceEx ref2 = (String x)->{
		System.out.println("To Lower  case : "+x.toLowerCase());
		return x;
	};
	private char result;

	
	interfaceEx ref4 = (x)->{
		System.out.println("Reverse String : ");
		for(int i = x.length()-1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
		
		return x;
      };
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringManipulate obj = new StringManipulate();
		obj.ref.meth1("buddhadeb");
		obj.ref2.meth1("BUDDHADEB");
		obj.ref4.meth1("Java");
		
	}

}
