package sec06.exam01;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f; //���� ������ ������ ����ϴ� ��� �ε��Ҽ��� Ÿ���� 0.1�� ��Ȯ�� ǥ���� �� ����.
		System.out.println(v4 == v5); //false
		
		//���� �����ڿ� �ǿ����ڸ� float Ÿ������ ���� Ÿ�Ժ�ȯ�ϰų� ������ ��ȯ�ؼ� ���ؾ��Ѵ�.
		
		System.out.println((float)v4 == v5); //floatŸ������ ��ȯ
		System.out.println(v4*10 == v5*10); //������ ��ȯ
		
	}

}