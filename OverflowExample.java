package sec06.exam01;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//x�� y�� int Ÿ���̰� z ���� int Ÿ���̴�. ������ ������ �߻����� ������, ������� int Ÿ�Կ� ����� �� �ִ� ���� ������ �ʰ��ϹǷ� �����Ⱚ�� ����ȴ�.
	    
		long a = 1000000;
		int b = 1000000;
		long c = a * b;
		System.out.println(c);
		//�ùٸ� ���� ��� ���ؼ� ���� �� �ּ� �ϳ��� long Ÿ���� �Ǿ���ϰ�, ��� �� ���� long Ÿ���̾���Ѵ�.
	}

}
