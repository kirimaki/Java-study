package sec06.exam01;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		System.out.println(num3); // 123456780 �� 23��Ʈ�� ǥ���� �� ���� ������ �ٻ�ġ�� ��ȯ�Ǿ� ���е� �ս��� �߻��Ѵ�.
		num2 = (int) num3;
		
		int result = num1 - num2; // int ���� float Ÿ������ ��ȯ�ϸ鼭 �����߻�
		System.out.println(result);
		
		
	}

}
