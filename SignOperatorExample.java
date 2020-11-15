package sec06.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1); //부호 유지 양수면 양수, 음수면 음수
		System.out.println("result2 = " + result2); //부호 반전 양수면 음수, 음수면 양수
		
		short s = 100;
		//short result3 = -s; //컴파일에러
		int result3 = -s; //기본타입인 int타입으로 됨.
		System.out.println(result3);
		
	}

}
