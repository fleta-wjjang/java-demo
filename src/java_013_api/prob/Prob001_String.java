﻿package java_013_api.prob;



/*
 * [출력결과]
 * Samsung 상품 정보
 * 제품번호 : PROD-00001, 제품명 : 갤럭시S, 수량 : 5, 가격 : 940000
 */

public class Prob001_String {

	public static void main(String[] args) {
		String msg = "PROD-00001**Samsung**갤럭시S**5**940000";
		Product prod = createProduct(msg);
		System.out.println(prod.getMaker() + " 상품 정보");
		System.out.println(prod.toString());
	}//end main()

	private static Product createProduct(String message) {
		//매개변수로 들어온 문자열을 적절히 이용하여 
		//Product 객체를 생성후 리턴하는createProduct() 메서드를 구현하시오. 
		
		String[] data = message.split("\\*");
             
		Product pd = new Product();
		pd.setMaker(data[2]);
		pd.setName(data[4]);
		pd.setPrice(Integer.parseInt(data[8]));
		pd.setAmount(Integer.parseInt(data[6]));
		pd.setProductId(data[0]);
		return pd;
		
		
	}// end creatProduct
}// end class






