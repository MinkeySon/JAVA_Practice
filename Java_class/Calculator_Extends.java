package Java_class;

class Cal{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}


class Subcal extends Cal{
	public void sub() {
		System.out.println(this.left-this.right);
	}
}
public class Calculator_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subcal c1 = new Subcal();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();

	}

}
