package sec06.exam01;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit * number;
		
		System.out.println("��� �Ѱ����� " + pieceUnit * number + "������ ���� " + result + "������ ���´�");
		//0.3�� ����� ���;������� ���������� ������ ����ϴ� �ε��Ҽ���(double,float)�� 0.1 �� ��Ȯ�� ǥ���� �� ���� �ٻ�ġ�� ó���Ѵ�. ���� ��Ȯ�� ����� �ʿ��� ���� �Ʒ��� ���� ������������ ����!
	
		int apple2 = 1;
		int totalPieces = apple2 * 10;
		int number2 = 7;
		
		int temp = totalPieces - number2;
		//���� ������ �� ���� �ٽ� �Ҽ������� ��ȯ.
		
		double result2 = temp / 10.0;
		
		System.out.println("��� �Ѱ����� " + number2 / 10.0 + "������ ���� " + result2 + "������ ���´�");
	
	}
	
}
