package sec06.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//�ڵ� Ÿ�Ժ�ȯ (������)
		byte byteValue = 10;
		int intValue = byteValue; // byte -> int
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; //char -> int
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue; // int -> long
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // int -> double
		System.out.println(doubleValue);
		
	}
}
