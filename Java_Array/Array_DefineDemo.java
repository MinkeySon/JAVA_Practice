package Java_Array;

public class Array_DefineDemo {

	public static void main(String[] args) {
		String[] classGroup1 = {"손민기","김유성","이동현"};
		System.out.println(classGroup1[0]);
		System.out.println(classGroup1[1]);
		System.out.println(classGroup1[2]);
		
		
		// 자바에서는 배열 빈공간을 만들어놔야함
		String[] classGroup2 = new String[4];
		classGroup2[0] = "손민기";
		System.out.println(classGroup2.length);
		classGroup2[1] = "김유성";
		System.out.println(classGroup2.length);
		classGroup2[2] = "이동현";
		System.out.println(classGroup2.length);
				

	}

}
