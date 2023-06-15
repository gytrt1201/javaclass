package weak01.day01;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		System.out.println("프로그램 시작!");
//		new Scanner(System.in).next();
//		System.out.println("프로그램 끝!");
		
		Scanner sc = new Scanner(System.in);
//		String msg = "Hello";
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println(name+"님 어서오세요~");
		
		System.out.print("주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("사는곳 : "+addr);
		
		System.out.print("숫자 : ");
		int data = sc.nextInt();
		System.out.println(data+10);
	}
}