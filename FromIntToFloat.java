package sec06.exam01;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		System.out.println(num3); // 123456780 을 23비트로 표현할 수 없기 때문에 근사치로 변환되어 정밀도 손실이 발생한다.
		num2 = (int) num3;
		
		int result = num1 - num2; // int 값을 float 타입으로 변환하면서 문제발생
		System.out.println(result);
		
		
	}

}
