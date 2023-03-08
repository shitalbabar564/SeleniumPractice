
public class CoreJavaBrushUp01 {

	public static void main(String[] args) {
		int num = 5;
		String name = "shital";
		float value = 4.6f;
		double value1 = 4.99;
		Boolean status = true;
		System.out.println("Given value is" + " " + num);
		System.out.println(name);
		// working with non primitive datatype
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);
		// or
		String arr1[] = { "Shital", "babar", "Selenium" };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		//Enhanced for loop
		for(String s:arr1) {
			System.out.println(s);
		}

	}

}
