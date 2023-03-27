package Java_Access;

class A{
	public String y() {
		return "public void y()"; // public은 다른 클래스 사용 가능
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}

public class access_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		System.out.println(a.y());
		System.out.println(a.x()); // A 같은 클래스 내에서는 에러 발생x
		
//		System.out.println(a.z()); // access_1 다른 클래스라서 에러 발생
		

	}

}
