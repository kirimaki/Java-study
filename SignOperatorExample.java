package sec06.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1); //��ȣ ���� ����� ���, ������ ����
		System.out.println("result2 = " + result2); //��ȣ ���� ����� ����, ������ ���
		
		short s = 100;
		//short result3 = -s; //�����Ͽ���
		int result3 = -s; //�⺻Ÿ���� intŸ������ ��.
		System.out.println(result3);
		
	}

}
