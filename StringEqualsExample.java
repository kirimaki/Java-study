package sec06.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "김주연";
		String strVar2 = "김주연";
		String strVar3 = new String("김주연");
		
		System.out.println(strVar1 == strVar2); //true 같은 String 객체의 번지값을 가지고 있으므로 true
		System.out.println(strVar1 == strVar3); //false strVar3은 새로운 String 객체의 번지값을 가지게되므로 false
		
		System.out.println(strVar1.equals(strVar2)); //true String 객체 안의 문자열 값만을 비교하므로 true
		System.out.println(strVar3.equals(strVar2)); //true 위와 마찬가지로 true
		
	}

}
