package weak01.day04;

public class ShiningStar {
	public static void main(String[] args) {
		/*
			*****
		 	*****
		 	*****
		 	*****
		 	*****
	 	*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		/*
			*
			**
			***
			****
			*****
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		/*
			*****
			****
			***
			**
			*
		*/
		
		for (int i = 5; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		/*
			*
			***
			*****
			*******
			*********
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//0		1
		//1		3
		//2		5
		
		System.out.println("================================");
        /*
			0000*		********* 	*********
			000***		0*******  	  *******
			00*****		00*****         *****
			0*******	000***            ***
			*********	0000*   			*
		*/
		/*
				*
		 	   ***
		 	  *****
		 	 *******
		 	*********
		 	 *******
		      *****
		       ***
		        *
		*/
	}
}



