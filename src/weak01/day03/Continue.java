package weak01.day03;

public class Continue {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			if(i == 9) {
//				continue;
//			}
//			System.out.println(i);
//		}
		//0 1 2 3 4 5 6 7 8
		//초기식 -> 조건식검사 -> 반복 -> 증감식
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
			}
			else {
				System.out.println(i);
			}
		}
	}
}
