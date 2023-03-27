package Java_Overiding;

class Sub extends Calculator{
	
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return super.avg(); // return 이므로 int형으로 바꾸고 부모메소드 그대로 가져옴
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class Overiding_2_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub c1 = new Sub();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는" + c1.avg());
        c1.substract();


	}

}
