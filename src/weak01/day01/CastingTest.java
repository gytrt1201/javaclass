package weak01.day01;

import java.util.Scanner;

public class CastingTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
//		System.out.println("결과 : "+num1/(num2+0.0));
		System.out.println("결과 : "+num1/(double)num2);
		
		System.out.println("=====================================");
		//아스키 코드 : 문자마다 대응되는 정수값
		//'A' : 65 / 'a' : 97 / '0' : 48
		System.out.println('A'+5);
		System.out.println("A"+5);
		
		System.out.println("=====================================");
		
		System.out.print("첫번째 정수 : ");
		String num3 = sc.next();
		System.out.print("두번째 정수 : ");
		String num4 = sc.next();

		//문자열 -> 정수, 실수
		int data1 = Integer.parseInt(num3);
		double data2 = Double.parseDouble(num4);
		
		//%.2f : 소수점 둘째자리까지 출력
		System.out.printf("결과 : %.2f", data1/data2);
	}
}