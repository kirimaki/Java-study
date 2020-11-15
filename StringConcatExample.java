package sec06.exam01;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3); //연산식은 왼쪽부터 실행되므로 "JDK" + 3 은 문자열 연산이 되고 그 후의 연산도 문자열 연산으로 실행된다.
		System.out.println(str4); //연산식은 왼쪽부터 실행되므로 3 + 3.0 은 산술연산이 되어 6.0이 되고 그 후의 연산이 문자열 연산으로 실행된다.
		
	}

}
