package sec06.exam01;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 44032;
		char charValue = (char) intValue; //int -> char (char의 크기는 0~65535 이므로 값이 손실되지 않고 저장된다.)
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; // long -> int (끝의 4byte만 남게되지만 int타입의 범위이므로 값이 손실되지않고 저장된다.)
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //double -> int (소수점 이하 부분은 버려지고, 정수 부분만 저장된다.)
		System.out.println(intValue); 
		
	}

}
