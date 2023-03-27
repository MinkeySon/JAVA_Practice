package Java_Abstract;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    
    int _sum() {
    	return this.left+this.right; //중복제거
    }
    
    public abstract void sum(); // sum 메소드 출력값은 사용자에게 맡김 
    public abstract void avg(); // avg 메소드 출력값은 사용자에게 맡김
    public void run(){
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum()); //sum()은 부모클래스에서 가져옴
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 

public class Abstract_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();

	}

}
