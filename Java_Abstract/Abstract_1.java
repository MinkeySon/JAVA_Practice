package Java_Abstract;

abstract class A{ // 추상클래스 내에서는일반메소드도 로직 가능!
	public abstract int b();
	
	public void d() {
		System.out.println("hello");
	}
}

// class B extends A; 추상 클래스는 클래스 내에 있는 추상 메소드를 오버로딩해야함!(필수)

class B extends A{
	public int b() {
		return 1;
	}
}

public class Abstract_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.b();

	}

}
