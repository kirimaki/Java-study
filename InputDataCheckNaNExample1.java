package sec06.exam01;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		//currentBalance += val;
		//System.out.println(currentBalance);
		//사용자로부터 입력값 NaN 을 받게되면 연산이 가능한 NaN으로 인하여 결과값이 엉망이 된다.
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		//NaN인지 조사를 할때 == 연산자를 사용하면 안된다. NaN은 != 연산자를 제외한 모든 비교연산자를 사용할 경우 false 값을 리턴하기 때문이다.
		currentBalance += val;
		System.out.println(currentBalance);
		
		
	}

}
