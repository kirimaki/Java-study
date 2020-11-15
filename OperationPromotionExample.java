package sec06.exam01;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일에러
		byte byteValue3 = (byte) (byteValue1 + byteValue2); //정수연산은 int 타입을 기본으로 하기때문에 casting을 해주어야한다.
		int intValue1 = byteValue1 + byteValue2;
		
		System.out.println(byteValue3);
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2; //컴파일에러
		char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;
		
		System.out.println(charValue3);
		System.out.println(intValue2);

		int intValue3 = 10;
		//int intValue4 = 10 / 4.0; //컴파일에러
		int intValue4 = (int) (intValue3 / 4.0); //castiong을 해주어야하지만 값 손실 발생.
		float floatValue1 = intValue3 / 4.0f;
		double doubleValue1 = intValue3 / 4.0;
		
		System.out.println(intValue4);
		System.out.println(floatValue1);
		System.out.println(doubleValue1);
		
		
	}
	
}
