package weak01.day03;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//5칸 빈 배열 생성 후 / 1~5 넣어준 후 / 출력
		int[] arData1 = new int[5];
		
//		arData1[0] = 1;
//		arData1[1] = 2;
//		arData1[2] = 3;
//		arData1[3] = 4;
//		arData1[4] = 5;
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = i*1+1;
		}
		
//		System.out.println(arData1[0]);
//		System.out.println(arData1[1]);
//		System.out.println(arData1[2]);
//		System.out.println(arData1[3]);
//		System.out.println(arData1[4]);
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
		//5칸 빈 배열 생성 후 10,7,4,1,-2 넣어준 후 출력 --> {10,7,4,1,-2} (X)
		int[] arData2 = new int[5];
		//0	10
		//1	7
		//2	4
		//3	1
		//4	-2
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = -3*i+10;
		}
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
		//사용자에게 정수 3개 입력받아서 전체 출력 후 총 합도 출력
		Scanner sc = new Scanner(System.in);
		int[] arData3 = new int[3];
		
//		System.out.print("정수 : ");
//		arData3[0] = sc.nextInt();
//		System.out.print("정수 : ");
//		arData3[1] = sc.nextInt();
//		System.out.print("정수 : ");
//		arData3[2] = sc.nextInt();
		for (int i = 0; i < arData3.length; i++) {
			System.out.print("정수 : ");
			arData3[i] = sc.nextInt();			
		}
		
		int result = 0;
//		result += arData3[0];
//		result += arData3[1];
//		result += arData3[2];
		for (int i = 0; i < arData3.length; i++) {
			result += arData3[i];
		}
		for (int i = 0; i < arData3.length; i++) {
			System.out.println(arData3[i]);
		}
		System.out.println("총합 : "+result);
		
		//1,100,7,35,78,2,17,890,25,6 반복문 사용해서 출력
		int[] arData4 = {1,100,7,35,78,2,17,890,25,6};
		for (int i = 0; i < arData4.length; i++) {
			System.out.println(arData4[i]);
		}
		
		//[ | | | | | | | | | ]
		//20칸 빈 배열 생성 후 홀수번째 방은 -2, -4, -6, -8, ... 넣고,
		//짝수번째 방은 1, 3, 5, ... 넣기
		int[] arData5 = new int[20];
//		arData5[0] = -2;
//		arData5[2] = -4;
//		arData5[4] = -6;
//		
//		arData5[1] = 1;
//		arData5[3] = 3;
		for (int i = 0; i < arData5.length; i++) {
//			arData5[i] = i%2==0 ? -1*i-2 : i;
			if(i%2 == 0) {
				arData5[i] = -1*i-2;
			}
			else {
				arData5[i] = i;
			}
		}
		
		for (int i = 0; i < arData5.length; i++) {
			System.out.println(arData5[i]);
		}
		//20칸 빈 배열 생성 후 홀수번째 방은 -1, -4, -7, -10, ... 넣고,
		//짝수번째 방은 2, 7, 12, 17, ... 넣기
		
//		arData5[0] = -1; 1번 방
//		arData5[1] = 2;  2번 방
//		arData5[2] = -4; 3번 방 
//		arData5[3] = 7;  4번 방
//		arData5[4] = -7; 5번 방
//		arData5[5] = 12; 6번 방

		// -1 ,2, -4, 7, -12, 12
		int[] arData6 = new int[20];
		int minus = -1;
		int plus = 2;
		for (int i = 0; i < arData6.length; i++) {
			

			
			if (i % 2 == 0) { // i가 짝수 인 경우
				if (i == 0) {
					arData6[i] = minus;
				}else {
					minus -= 3;
					arData6[i] = minus;
				}
			}else {
				if (i == 1) {
					arData6[i] = plus;
				}else {
					plus += 5;
					arData6[i] = plus;
				}
			}
			
		}
		for (int i = 0; i < arData6.length; i++) {
			System.out.println(arData6[i]);
		}		
		
		
		//사용자에게 국어점수, 수학점수, 영어점수 입력받은 후 전체 점수 출력하고 총점과 평균 출력
		//입력
		//국어 점수 : 
		//수학 점수 : 
		//영어 점수 : 
		//출력
		//국어점수 : 100점
		//수학점수 : 80점
		//영어점수 : 90점
		//총점 : 270점
		//평균 : 90.0점
		String[] arSubjects = {"국어","수학","영어","JAVA"};
		int[] arScore = new int[arSubjects.length];
//		System.out.print(arSubjects[0]+"점수 : ");
//		arScore[0] = sc.nextInt();
//		
//		System.out.print(arSubjects[1]+"점수 : ");
//		arScore[1] = sc.nextInt();
//		
//		System.out.print(arSubjects[2]+"점수 : ");
//		arScore[2] = sc.nextInt();
		for (int i = 0; i < arScore.length; i++) {
			System.out.print(arSubjects[i]+"점수 : ");
			arScore[i] = sc.nextInt();
		}
		
		int tot = 0;
		for (int i = 0; i < arSubjects.length; i++) {
			tot += arScore[i];
		}
		double avg = tot / (double)arSubjects.length;
//		System.out.println(arSubjects[0]+"점수 : "+arScore[0]+"점");
//		System.out.println(arSubjects[1]+"점수 : "+arScore[1]+"점");
//		System.out.println(arSubjects[2]+"점수 : "+arScore[2]+"점");
		for (int i = 0; i < arSubjects.length; i++) {
			System.out.println(arSubjects[i]+"점수 : "+arScore[i]+"점");
		}
		System.out.println("총점 : "+tot+"점");
		System.out.printf("평균 : %.1f\n",avg);
		
		//위의 문제에서 사용자에게 과목 수와 과목 명 입력받고 똑같은 과정 하기 
	}
}



