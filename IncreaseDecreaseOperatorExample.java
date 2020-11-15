package sec06.exam01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z = 1;
		
		int result1 = x++ + z;
		int result2 = ++y + z;
		
		System.out.println(result1); // 후위 증감연산자는 x + z 의 연산이 먼저 된 후 x에 값이 증감된 11을 저장한다.
		System.out.println(result2); // 전위 증감연산자는 y에 값이 증감된 11을 저장한 후 y+z가 연산된다.
	
		
	}
}
