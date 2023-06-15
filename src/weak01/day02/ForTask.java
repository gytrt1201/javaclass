package weak01.day02;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		초기식은 i=0, 증감식은 i++
		
//		1부터 10까지 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
//		10부터 1까지 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(10-i);
		}
		
//		12부터 3씩 증가하며 13번 출력하기
		for (int i = 0; i < 13; i++) {
			System.out.println(i*3+12);
		}
//		100 94 88 .... 28 출력하기
		for (int i = 0; i < 13; i++) {
			System.out.println(i*-6+100);
		}
		
//		result = 0;
//		result = result+1;
//		result = result+2;
//		...
//		1부터 10까지의 총 합 구하기
		int result = 0;
		for(int i=0;i<10;i++) {
			result += i+1;
			//			0	1
			//			1	2
			//			2	3
		}
		System.out.println(result);
		
//		n 하나 입력받아서 1부터 n까지의 총 합 구하기
//		n 하나 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
//		1부터 n까지의 총 합 구하기
		result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
//		구해진 총 합 출력
		System.out.println(result);
		
//		n, m 입력받아서 n부터 m까지 출력하기
		System.out.print("n 입력 : ");
		n = sc.nextInt();
		System.out.print("m 입력 : ");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}
		
//		1부터 100까지 중 짝수만 출력하기
		for(int i=1;i<=100;i++){
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
//		1부터 100까지 중 3과 5의 공배수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
		
//		65   70
//		A 부터 F 까지 출력하기
		for (int i = 65; i <= 70; i++) {
			System.out.println((char)i);
		}
//		1부터 100까지 중 3의 배수와 5의 배수를 출력하되 공배수는 제외하고 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%5 == 0) {
				if(     !(i%3 == 0 && i%5 == 0)    ) {
//						i%3 != 0 || i%5 != 0
					System.out.println(i);
				}
			}
		}
//		AbCdEf.....Yz 출력하기
//		A(65+0)		a(97)
//		C(65+2)		b(97+1)
//		E(65+4)		d(97+3)
//		G(65+6)		f(97+5)
		String msg = "";
//		msg += (char)(65+0);
//		msg += (char)(97+1);
//		msg += (char)(65+2);
		for (int i = 0; i < 26; i++) {
			msg += (char)((i%2 == 0 ? 65 : 97)+i);
//			if(i%2 == 0) {
//				msg += (char)(65+i);
//			}
//			else {
//				msg += (char)(97+i);
//			}
		}
		System.out.println(msg);
		
//		중첩반복문 사용하지 않고 구구단 전부 출력하기
//		10진수 숫자 입력받아서 2진수로 출력하기
//		ABCDefghIJKLmnopQRSTuvwxYZ 출력하기
//		AbCDefGHIjklMNOPqrstUVWXYz 출력하기
	}
}



