package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		//단락회로평가
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2, 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i 값은 그대로
		
		value = ((num1 = num1+ 10) > 10) || (( i = i + 2) < 10);
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2, 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i 값은 그대로
		
		int num = 5;
		i = 10;
		
		value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println(value); // true
		System.out.println(num);  // 50
		System.out.println(i); // 10
		
	}

}
