package statements;

public class Java_029_for {

	public static void main(String[] args) {
		
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				even = even + i;
			}else odd = odd +i;
		}
		
		System.out.printf("홀수누적=%d", odd);
		System.out.printf("짝수누적=%d", even);
	}

}
