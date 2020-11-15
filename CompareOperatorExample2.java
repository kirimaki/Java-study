package sec06.exam01;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f; //이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수 없다.
		System.out.println(v4 == v5); //false
		
		//따라서 연산자와 피연산자를 float 타입으로 강제 타입변환하거나 정수로 변환해서 비교해야한다.
		
		System.out.println((float)v4 == v5); //float타입으로 변환
		System.out.println(v4*10 == v5*10); //정수로 변환
		
	}

}
