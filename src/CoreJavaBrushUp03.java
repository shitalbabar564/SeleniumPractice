import org.checkerframework.checker.units.qual.Length;

public class CoreJavaBrushUp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String object creation using string literal concept
		String s1 = "Shital Mansing Babar";
		// String object creation using new keyword
		String s2 = new String("ShitalBabar");

		System.out.println(s1);
		// split using white spaces
		String[] splitedString = s1.split("Mansing");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		String newString = splitedString[1].trim();
		System.out.println(newString);

		// print char by char from string s1
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}

		// print charachters in reverse order
		String s3 = "Shital";
		char ch = 0;
		String nstr = "";
		System.out.println("Origional String:" + " " + s3);
		// s3.charAt(5);
		for (int i = 0; i < s3.length(); i++) {
			System.out.println(s3.charAt(i));
			ch = s3.charAt(i);

			nstr = ch + nstr;
		}
		System.out.println("String After Reverse:" + " " + nstr);
		System.out.println("New logic");
		for (int i = s3.length() - 1; i>=0; i--)
		{
			System.out.print(s3.charAt(i));
			// System.out.println("hi");
			// ch=s3.charAt(i);

			// nstr=ch+nstr;
		}

	}

}
