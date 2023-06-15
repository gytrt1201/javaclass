package weak01.day04;

public class SortTest {
	public static void main(String[] args) {
		int[] arData = {4,7,1,3,6,9,10,2,5,8};
		
		//최소값 구하기
		int min = arData[0];
		int idx = 0;
		
		for (int i = 0; i < arData.length; i++) {
			if(min > arData[i]){
				min = arData[i];
				idx = i;
			}
		}
		System.out.println("최소값은 "+min+"이고 인덱스는 "+idx+"입니다.");
		
		//최대값 구하기
		int max = arData[0];
		idx = 0;
		
		for (int i = 1; i < arData.length; i++) {
			if(max < arData[i]) {
				max = arData[i];
				idx = i;
			}
		}
		System.out.println("최대값은 "+max+"이고 인덱스는 "+idx+"입니다.");
		
		//정렬
		//{4,7,1,3,6,9,10,2,5,8}
		//7 4
		int temp = 0;
		for (int i = 0; i < arData.length-1; i++) {
			for (int j = i+1; j < arData.length; j++) {
				if(arData[i] > arData[j]) {
					temp = arData[i];
					arData[i] = arData[j];
					arData[j] = temp;
				}
			}
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]+" ");
		}
		
//		i		j
//		0		1 2 3 4 5 6 7 8 9
//		1		2 3 4 5 6 7 8 9
//		2		3 4 5 6 7 8 9
		
	}
}






