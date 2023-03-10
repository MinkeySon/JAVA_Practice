package Java_Conditional_Operator;

public class Conditional_Or {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if ((id.equals("Son")||id.equals("Min")||id.equals("Gi"))
				&& pw.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
