package Java_class;

class Calculator{
	int left, right;
	
	 //기본생성자
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+ this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

class SubstractionableCalculator extends Calculator{
	public SubstractionableCalculator(int left, int right) {
		super(left,right);
	}
	
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class Java_Super_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1 = new SubstractionableCalculator(10,20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
