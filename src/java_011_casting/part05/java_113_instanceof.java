package java_011_casting.part05;

class ExamA{
	void prn() {}
}

class ExamB extends ExamA{
	void prn() {}
}

class ExamC extends ExamB{
	void prn() {}
}
public class java_113_instanceof {


	//////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		//객체 instanceof 비교 데이터 타입과 같거나 조상데이터 타입
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA);
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB);
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA);
	}

}
