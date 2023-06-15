package weak01.day03;

import java.util.Scanner;

public class NestedFor {
	public static void main(String[] args) {
//		Alt + Shift + R : 사용하는 곳과 선언하는 곳 함께 이름 변경하기
		int[][] arrData1 = new int[3][];
		for (int i = 0; i < 3; i++) {
			System.out.println(arrData1[i]);
		}
		arrData1[0] = new int[5];
		arrData1[1] = new int[3];
		arrData1[2] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arrData1.length; i++) {
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println(i+"행의 데이터 입력 시작!");
			for (int j = 0; j < arrData1[i].length; j++) {
				System.out.print(i+"행 "+j+"열 데이터 : ");
				arrData1[i][j] = sc.nextInt();
			}
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		}
		
//		------2단------
//		2 X 1 = 2
//		2 X 2 = 4
//		....
//		2 X 9 = 18
//		System.out.println("------"+2+"단------");
//		for (int j = 1; j <= 9; j++) {
//			System.out.printf("2 X %d = %d\n",j,j*2);
//		}
//		------3단------
		for (int i = 2; i <= 9; i++) {
			System.out.println("------"+i+"단------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,j*i);
			}
		}
		
		/*
			*****	*		*****	*				*		*********
		 	*****	**		****	***			   ***		 *******
		 	*****	***		***		*****		  *****		  *****
		 	*****	****	**		*******		 *******	   ***
		 	*****	*****	*		*********	*********		*
		*/
//		국어점수 그거 여러 학생용으로 만들기
//		학생수 입력 -> 과목수, 과목명 입력받기 -> 첫번째 학생부터 ~ n번째 학생까지의 점수 입력받기
//		출력은 한 사람당 총점, 평균 / 전체 평균 출력
//		각 과목별 평균
		
		
		
		
		
		//codeup.kr
	}
}







