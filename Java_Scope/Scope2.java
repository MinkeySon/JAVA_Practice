package Java_Scope;

public class Scope2 {
	static int i = 5; //i는 전역변수
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		System.out.println(i); //i는 지역변수
	}
	public static void main(String[] args) {
		a();
	}

}
