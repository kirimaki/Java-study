package sec06.exam01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z = 1;
		
		int result1 = x++ + z;
		int result2 = ++y + z;
		
		System.out.println(result1); // ���� ���������ڴ� x + z �� ������ ���� �� �� x�� ���� ������ 11�� �����Ѵ�.
		System.out.println(result2); // ���� ���������ڴ� y�� ���� ������ 11�� ������ �� y+z�� ����ȴ�.
	
		
	}
}
