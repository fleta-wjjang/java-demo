package statements;

public class Java_042_array {

	public static void main(String[] args) {
		
		char[] data = new char[] {'a', 'b', 'F', 'R', 'a'};
		int cnt = 0; // 대문자 개수를 저장하기 위한 변수
		
		/*
		 * 데이터 배열에서 대문자이 갯수를 추력하는 프로그램 구현
		 * 
		 * [출력결과]
		 * 대문자 갯수 : 2
		 */
		for(int i=0; i<data.length; i++) {
			if(data[i] >='A' && data[i] <='Z' ) { cnt++;}
		}
		
		
		System.out.printf("대문자의 갯수 : %d", cnt);
		
	}

}
