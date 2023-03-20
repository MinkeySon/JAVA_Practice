package Java_Scope;

public class Scope1 {
	
	static void a() {
		int i = 0; // i는 a의 유효범위라서 밑에 반복문에 영향 x
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++) {
			a();
			System.out.println(i);
		}

	}

}
