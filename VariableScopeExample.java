package sec06.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v3 = 0;
		if(v1 > 10) {
			int v2 = v1 - 10;
			v3 = v2;
		}
		int v4 = v1 + v3 + 5;
		System.out.println(v4);
	}

}
