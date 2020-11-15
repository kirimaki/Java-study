package sec06.exam01;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//x와 y는 int 타입이고 z 역시 int 타입이다. 컴파일 에러는 발생하지 않지만, 결과값인 int 타입에 저장될 수 있는 값의 범위를 초과하므로 쓰레기값이 저장된다.
	    
		long a = 1000000;
		int b = 1000000;
		long c = a * b;
		System.out.println(c);
		//올바른 값을 얻기 위해서 변수 중 최소 하나라도 long 타입이 되어야하고, 결과 값 역시 long 타입이어야한다.
	}

}
