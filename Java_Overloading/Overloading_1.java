package Java_Overloading;

class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    // 변수 3개를 저장하고 싶을때 setOprands2,3 메소드 이름을 다르게 하면 유지보수의 문제 때문에 오버로딩
    // Java에선 변수 데이터 타입이 다르거나 내용이 다르면 다른 메소드로 인식 -> 충돌이 없음
    
    // overriding vs overloading -> riding은 부모 클래스 받을 때 같은 메소드, loading은 같은 클래스 내에 같은 메소드
    
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.setOprands(left, right);
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class Overloading_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator c1 = new Calculator();
	        c1.setOprands(10, 20);
	        c1.sum();       
	        c1.avg();
	        c1.setOprands(10, 20, 30);
	        c1.sum();       
	        c1.avg();


	}

}
