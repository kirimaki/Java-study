package sec06.exam01;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 0;
		
		try {
			float z = x / y;
			System.out.println("z = " + z);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		} //10을 0으로 나누면 ArithmeticException 이 발생하고 프로그램이 종료되므로 예외처리를 하여 catch 블록이 실행되도록 함.

		int a = 5;
		double b = 0.0;
		
		double c = a / b; // (infinity)
		//double c = a % b; (NaN)
		
		System.out.println(Double.isInfinite(c));
		System.out.println(c + 2);
		
		//5를 0.0으로 나누면 예외처리가 발생하지않고 Infinity의 결과값을 가진다.
		
		//System.out.println(Double.isNaN(c));
		//5 % 0.0 의 결과는 예외처리가 발생하지 않고 NaN의 결과값을 가진다.
	
		if(Double.isInfinite(c) || Double.isNaN(c)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(c + 2);
		}
		//이와 같이 연산의 결과가 infinity 또는 NaN 이면 연산을 수행하지 못하도록 if문을 사용하여 실행 흐름을 변경해야한다.
	
	}

}
