package Java_Method_Polymorphism;

class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String x() { // A 메소드 오버라이딩 
		return "B.x";
			}
	public String y() {
		return "y";
	}
}     

class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class Poly_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(); // A 데이터 형태의 obj에 B 객체를 받음
		A obj2 = new B2();
		System.out.println(obj.x());
		// obj.y(); 데이터 타입이 A이기 때문에 자식 클래스에서 만든 메소드는 사용 불가능
		System.out.println(obj2.x());
	}

}
