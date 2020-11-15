package sec06.exam01;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		System.out.println(num3); // int의 크기는 32비트여서 double의 가수 52비트보다는 작기때문에 정밀도 손실없이 변환가능하다. 
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}
