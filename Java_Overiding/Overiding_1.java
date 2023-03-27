package Java_Overiding;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
    	return ((this.left+this.right)/2);
    }
}

class SubstractionableCalculator extends Calculator {
    
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
    // Calculator 객체에 sum 메소드가 있고 메소드를 재정의 한것을 overiding이라고함.
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class Overiding_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SubstractionableCalculator c1 = new SubstractionableCalculator();
	        c1.setOprands(10, 20); 
	        c1.sum();//sub객체의 sum메소드가 출력됨
	        c1.avg();
	        c1.substract();

	}

}
