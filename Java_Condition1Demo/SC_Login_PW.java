package Java_Condition1Demo;

public class SC_Login_PW {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("egoing")) {
			if (pw.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}
	}
}
