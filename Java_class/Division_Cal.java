package Java_class;

class DivCal extends MulCal{
	public void division() {
		System.out.println(this.left/this.right);
	}
}

public class Division_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivCal c1 = new DivCal();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiple();
		c1.division();

	}

}
