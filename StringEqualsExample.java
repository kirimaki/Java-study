package sec06.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "���ֿ�";
		String strVar2 = "���ֿ�";
		String strVar3 = new String("���ֿ�");
		
		System.out.println(strVar1 == strVar2); //true ���� String ��ü�� �������� ������ �����Ƿ� true
		System.out.println(strVar1 == strVar3); //false strVar3�� ���ο� String ��ü�� �������� �����ԵǹǷ� false
		
		System.out.println(strVar1.equals(strVar2)); //true String ��ü ���� ���ڿ� ������ ���ϹǷ� true
		System.out.println(strVar3.equals(strVar2)); //true ���� ���������� true
		
	}

}
