package sec06.exam01;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 44032;
		char charValue = (char) intValue; //int -> char (char�� ũ��� 0~65535 �̹Ƿ� ���� �սǵ��� �ʰ� ����ȴ�.)
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; // long -> int (���� 4byte�� ���Ե����� intŸ���� �����̹Ƿ� ���� �սǵ����ʰ� ����ȴ�.)
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //double -> int (�Ҽ��� ���� �κ��� ��������, ���� �κи� ����ȴ�.)
		System.out.println(intValue); 
		
	}

}
