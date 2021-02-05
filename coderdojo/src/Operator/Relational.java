package Operator;

public class Relational {

	public boolean isequals(int i, int j) {
		boolean b =(i==j);
		// TODO Auto-generated method stub
		return b;
	}

	public boolean notequal(int i, int j) {
		boolean b=(i!=j);
		// TODO Auto-generated method stub
		return b;
	}

	public boolean greaterthan(int i, int j) {
		boolean g=(i>j);
		// TODO Auto-generated method stub
		return g;
		
	}

	public boolean lessthan(int i, int j) {
		boolean l=(i<j);
		// TODO Auto-generated method stub
		return l;
	}

	public boolean greaterthanorequalto(int i, int j) {
		boolean k=(i>=j);
		// TODO Auto-generated method stub
		return k;
	}

	public boolean lessthanorequalto(int i, int j) {
		boolean h=(i<=j);
		// TODO Auto-generated method stub
		return false;
	}
	

}
