package Java_Method;

public class Method_입력 {
	public static void numbering(int init, int limit) { //limit = 매개변수(parameter)
		int i = init;
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering(1,5);//5 = 인자(argument)
		

	}

}
