package sec06.exam01;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3); //������� ���ʺ��� ����ǹǷ� "JDK" + 3 �� ���ڿ� ������ �ǰ� �� ���� ���굵 ���ڿ� �������� ����ȴ�.
		System.out.println(str4); //������� ���ʺ��� ����ǹǷ� 3 + 3.0 �� ��������� �Ǿ� 6.0�� �ǰ� �� ���� ������ ���ڿ� �������� ����ȴ�.
		
	}

}
