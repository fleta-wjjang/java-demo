package ncs.test02;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		 double data[]= new double[5];
		 double sum = 0;
		 String[] st = str.split(","); 
		 int i =0;
		 for(double d : data) {
			
			  d = Double.parseDouble(st[i]);
			  sum += Double.parseDouble(st[i]); 
			  i++;
		 }
		
		System.out.printf("합계:%.3f\n", sum);
		System.out.printf("평균:%.3f", sum/i);
		 
		 
		
	}

}
