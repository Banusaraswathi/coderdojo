package corejava;

import Operator.Arithmatic;
import Operator.Relational;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Arithmatic math =new Arithmatic();
		int s =math.add (12,14);
		System .out.println("sum of 12 and 14"+s);
		
		int sub =math.subtraction(14,12);
		System.out.println("subtraction of 14-12" +sub);
		int div =math.division(10,2);
		System.out.println("division of 10/2"+ div);
		
		Relational zxc =new Relational();
		boolean n =zxc.isequals (12,12);
	}

}
