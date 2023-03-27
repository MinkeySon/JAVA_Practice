package Java_class;

class MulCal extends Cal{
	public void multiple() {
		System.out.println(this.left*this.right);
	}
}

public class Multiple_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MulCal c1 = new MulCal();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiple();

	}

}
