package weak01.day03;

public class ArrTest1 {
	public static void main(String[] args) {
		//선언방법 1
		int[][] arrData1 = {
				{10,20,30},
				{40,50,60}
		};
		
		//선언방법 2
//		int[][] arrData2 =
//			{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int[][] arrData2 = new int[3][5];
		
		//공간으로 사용
		arrData2[1][3] = 10;
		//값을 사용
		System.out.println(arrData2[2][4]);
		
		//행의 개수만 지정한 채 선언
		int[][] arrData3 = new int[3][];
		for (int i = 0; i < 3; i++) {
			System.out.println(arrData3[i]);
		}
		//null : 주소값의 초기값, 비어있다 라는 뜻
//		행의 개수만 지정한 채 배열을 선언하면 한 번 접근해서 찾아갔을 때 연결되어 있는 공간들(소배열)이
//		존재하지 않기 때문에 먼저 소배열들을 만들어서 연결해주는 작업부터 하고 사용해야 한다.
//		arrData3[0][0] = 100;
		
		arrData3[0] = new int[5];
		arrData3[1] = new int[3];
		arrData3[2] = new int[8];
	}
}









