package weak01.day04;

public class MethodTask {
		public static void main(String[] args) {
			MethodTask m = new MethodTask();
			System.out.println(m.sum1ToN(15));
		}

//		1 ~ 10 출력하는 메소드
		void print1To10() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
		
//		1 ~ 10 합 구해주는 메소드
		int sum1To10() {
			int result = 0;
			for(int i=1;i<=10;i++) {
				result += i;
			}
			return result;
		}
		
//		1 ~ n 합 구해주는 메소드
		int sum1ToN(int n) {
			int result = 0;
			for(int i=1;i<=n;i++) {
				result += i;
			}
			return result;
		}
		
//		두 정수의 나눗셈 결과를 구해주는 메소드
		double divide(int n, int m) {
			double result = n/(double)m;
			return result;
		}
		
//		어떤 문자열을 n번만큼 출력하는 메소드
		void printStr(String str, int n) {
			for (int i = 0; i < n; i++) {
				System.out.println(str);
			}
		}
		
//		n부터 m까지의 합 구해주는 메소드(n이 m보다 작다고 가정)
		int sumNtoM(int n, int m) {
			int result = 0;
			for (int i = n; i <= m; i++) {
				result += i;
			}
			return result;
		}
		
//		문자열을 전부 대문자로 바꿔주는 메소드(hEllO~123 -> HELLO~123)
//		'A' : 65 / 'a' : 97
		String changeMsgToUpperCase(String msg) {
			String result = "";
			for (int i = 0; i < msg.length(); i++) {
				char ch = msg.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					result += (char)(ch-32);
				}
				else {
					result += ch;
				}
			}
			return result;
		}
//		문자열을 거꾸로 바꿔주는 메소드(Hello -> olleH)
		
		String reverse(String msg) {
			String result = "";
//			for (int i = 0; i < msg.length(); i++) {
//				result = msg.charAt(i)+result;
//			}
			for (int i = msg.length()-1; i >= 0; i++) {
				result += msg.charAt(i);
			}
			
			return result;
		}
		
//		문자열이 숫자로 이루어져 있는지 검사하는 메소드(숫자가 아닌것이 있으면 false)
//		is~~, has~~ : ~~이거나, ~~를 가지고 있으면 참 / 아니라면 거짓을 리턴하는 메소드(return타입이 boolean)
		boolean isDigit(String msg) {
			for (int i = 0; i < msg.length(); i++) {
				char ch = msg.charAt(i);
				if(ch < '0' || ch > '9') {
					return false;
				}
			}
			return true;
		}
		
//		문자열의 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드(hEllo~123 -> HeLLO~123)
		String changeCase(String msg) {
			String result = "";
			for (int i = 0; i < msg.length(); i++) {
				char ch = msg.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					result += (char)(ch-32);
				}
				else if(ch >= 'A' && ch <= 'Z') {
					result += (char)(ch+32);
				}
				else {
					result += ch;
				}
			}
			return result;
		}
//		정수를 한글로 바꿔주는 메소드(1024 -> 일공이사)
		String changeToHangle(int num) {						//1024
			String hangle = "공일이삼사오육칠팔구";
//			hangle.charAt(0) : "공" / hangle.charAt(6) : "육"
			String result = "";
			String data = num+"";							//"1024"
			
			for (int i = 0; i < data.length(); i++) {		//for문 4번
				char ch = data.charAt(i);					//'1' '0' '2' '4'
				//'1' -> 1 / 49 -> 1
				int idx = ch-48;							//1 0 2 4
				result += hangle.charAt(idx);
			}
			return result;
		}

//		int 배열 중에서 가장 작은 값 돌려주는 메소드
//		int 배열에 담겨있는 값들의 총 합 돌려주는 메소드
//		int 배열에 담겨있는 값들을 오름차순으로 정렬하는 메소드
}




