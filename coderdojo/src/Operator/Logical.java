package Operator;

public class Logical {

	public boolean andOperator(int num) {
		if (num != 0 && num > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean oroperator(int num) {
		if ((num % 6 == 0) || (num % 7 == 0)) {
			return true;
		} else {
			return false;

		}
	}
	
	public String oroperator2(boolean a,boolean b) {
		
		if ((a==true)||(b==true)) {
		
			String s="Success";
		return s;
		}else {
			String s="Failure";
			return s;
	}

}	
}

