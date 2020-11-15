package sec06.exam01;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit * number;
		
		System.out.println("사과 한개에서 " + pieceUnit * number + "조각을 빼면 " + result + "조각이 남는다");
		//0.3의 결과가 나와야하지만 이진포맷의 가수를 사용하는 부동소수점(double,float)은 0.1 을 정확히 표현할 수 없어 근사치로 처리한다. 따라서 정확한 계산이 필요할 때는 아래와 같이 정수연산으로 변경!
	
		int apple2 = 1;
		int totalPieces = apple2 * 10;
		int number2 = 7;
		
		int temp = totalPieces - number2;
		//정수 연산을 한 다음 다시 소수점으로 변환.
		
		double result2 = temp / 10.0;
		
		System.out.println("사과 한개에서 " + number2 / 10.0 + "조각을 빼면 " + result2 + "조각이 남는다");
	
	}
	
}
