package OOP_PT;
 
class Calculator3{
  
    public static void sum(int left, int right){
        System.out.println(left+right);
    } //static은 그 클래스 안에서만 작동
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class CL_class_Instance {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}