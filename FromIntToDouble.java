package sec06.exam01;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		System.out.println(num3); // int�� ũ��� 32��Ʈ���� double�� ���� 52��Ʈ���ٴ� �۱⶧���� ���е� �սǾ��� ��ȯ�����ϴ�. 
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}
