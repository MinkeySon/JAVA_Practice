package Java_Method;

public class MethodDemo2 {
	public static void numbering() {
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method는 자바-개발자 약속
		//재활용, 코드량, 유지보수시간 유리
		numbering();
		numbering();
		numbering();
		numbering();
		numbering();
	
	}

}
