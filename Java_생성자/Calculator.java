package Java_생성자;

class CL{
	int left, right;
	
	public CL(int left, int right) {
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

public class Calculator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CL c1 = new CL(10,20);
		c1.sum();
		c1.avg();
		
		CL c2 = new CL(20,40);
		c2.sum();
		c2.avg();

	}

}
