package weak01.day03;

import java.util.Scanner;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {1,2,3,4,5};
//		System.out.println(arData);
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}
//		배열의 index 자리에 i를 쓰자

//		arData[0] = 10;
//		arData[1] = 20;
//		arData[2] = 30;
//		arData[3] = 40;
//		arData[4] = 50;
		
//		arData[i] = 10*i+10;
		
//		선언방법 1
		int[] arData2 = {10,1,7,5,32,100,1741,1687};
//		for문의 반복횟수를 배열의 길이로 해놓으면 유지보수에 편리하다.
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
//		선언방법 2
		Scanner sc = new Scanner(System.in);
		int[] arData3 = new int[5];
		
		for (int i = 0; i < arData3.length; i++) {
			System.out.print("정수 : ");
			arData3[i] = sc.nextInt();
		}		
		
		for (int i = 0; i < arData3.length; i++) {
			System.out.println(arData3[i]);
		}
	}
}












