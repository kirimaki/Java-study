package sec06.exam01;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		//currentBalance += val;
		//System.out.println(currentBalance);
		//����ڷκ��� �Է°� NaN �� �ްԵǸ� ������ ������ NaN���� ���Ͽ� ������� ������ �ȴ�.
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		//NaN���� ���縦 �Ҷ� == �����ڸ� ����ϸ� �ȵȴ�. NaN�� != �����ڸ� ������ ��� �񱳿����ڸ� ����� ��� false ���� �����ϱ� �����̴�.
		currentBalance += val;
		System.out.println(currentBalance);
		
		
	}

}
