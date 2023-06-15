package weak01.day02;

public class ForTest {
	public static void main(String[] args) {
//		int cnt = 0;
//		while(cnt<10) {
//			System.out.println(cnt+1+". 정다솔");
//			cnt++;
//		}
		
		for(int cnt = 0; cnt<10; cnt++){
			System.out.println(cnt+1+". 정다솔");
		}
		
		//10번 반복하는 반복문
		for(int i=14;i>4;i--) {
			
		}
//		반복횟수 = (끝값-초기값)/증감값
//		(4-14)/-1
		
//		100부터 -3씩 하면서 13번 반복
		for(int i=100;i>61;i-=3) {
			
		}
//		for문도 결국 조건식이 참일동안 반복이다.
//		초기식, 조건식, 증감식은 다 생략이 가능하고
//		조건식을 생략할 시 무한반복
//		for(;true;) {
//			
//		}
		
//		2 4 6 8 10 12 14 16 18 20
//		for(int i=2;i<22;i+=2) {
//			System.out.println(i);
//		}
		for(int i=0;i<10;i++) {
			System.out.println(i*2+2);
		}
//		i	출력할 값
//		0	2
//		1	4
//		2	6
//		..
//		i	2*i+2
		
//		7 5 3 1 -1 -3 -5 -7 -9 -11 -13
		for(int i=0;i<11;i++) {
			System.out.println(i*-2+7);
		}
//		i	출력할 값
//		0	7
//		1	5
//		2	3
//		3	1
//		...
		
	}
}











