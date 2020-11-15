package sec06.exam01;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 0;
		
		try {
			float z = x / y;
			System.out.println("z = " + z);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		} //10�� 0���� ������ ArithmeticException �� �߻��ϰ� ���α׷��� ����ǹǷ� ����ó���� �Ͽ� catch ����� ����ǵ��� ��.

		int a = 5;
		double b = 0.0;
		
		double c = a / b; // (infinity)
		//double c = a % b; (NaN)
		
		System.out.println(Double.isInfinite(c));
		System.out.println(c + 2);
		
		//5�� 0.0���� ������ ����ó���� �߻������ʰ� Infinity�� ������� ������.
		
		//System.out.println(Double.isNaN(c));
		//5 % 0.0 �� ����� ����ó���� �߻����� �ʰ� NaN�� ������� ������.
	
		if(Double.isInfinite(c) || Double.isNaN(c)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(c + 2);
		}
		//�̿� ���� ������ ����� infinity �Ǵ� NaN �̸� ������ �������� ���ϵ��� if���� ����Ͽ� ���� �帧�� �����ؾ��Ѵ�.
	
	}

}
