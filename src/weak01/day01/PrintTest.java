package weak01.day01;

//Ctrl + Spacebar : 자동 완성
public class PrintTest {
//	main 작성 > 자동완성 : main메소드 만들기
//	main 메소드 : 프로그램의 시작점, 진입점
	public static void main(String[] args) {
//		Ctrl + / : 주석 처리(해제)
//		한 줄 주석ㅏㄴ밍러;ㅁㄴ알;ㅁ닐
		/*
		 * 여러줄
		 * 주석
		 */
//		Alt + ↑(↓) : 위(아래)로 선택된 줄 이동
//		Ctrl + Alt + ↑(↓) : 위(아래)로 선택된 줄 복사
//		Ctrl + F11 : 실행
		System.out.println("Hello Java!");
//		syso 작성 > 자동완성 : System.out.println() 자동 작성
		System.out.println(10);
		System.out.println(5+3);
		System.out.println(5>3);
		
//		"예쁜
//		정다솔"
		System.out.println("\"예쁜\n정다솔\"");
		
		System.out.println("이름 : "+"정다솔");
		System.out.println();
		System.out.print("나이 : "+22+'\n');
		System.out.println("키 : "+180+"cm");
		
//		1 + 3 = 4
//		System.out.println("1 + 3 = 4");
		System.out.println(1 + " + " + 3 + " = " + (1+3));
		
		System.out.printf("%d + %d = %d\n",1,3,1+3);
		
//		Ctrl + M : 현재 창 확대, 축소
		String name = "정다솔";
		int age = 22;
		float height = 180.24f;
		double weight = 84.11;
		char score = 'B';
		
		System.out.println("========"+name+"님의 정보========");
		System.out.println("이름 : "+name);
		System.out.print("나이 : "+age+'\n');
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("성적 : "+score);
	}
}