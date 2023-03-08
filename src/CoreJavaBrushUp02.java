import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,4,5,6,7,8,9,10,122};
		// get multilpales by 2 from above array
		//i.e 2,4,6,8,10,122
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
				
			}
	
		List<String> names=new ArrayList<String>();
		names.add("Shital");
		names.add("babar");
		names.add("java");
		names.add("selenium");
		System.out.println(names);
		//fetch particular item from the list
		System.out.println(names.get(1));
		//all elements printing using for loop
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(3));
		}
		String student[]= {"a","b","c","d"};
		//convert array into List
		List<String> name=Arrays.asList(student);
		System.out.println(name);
	
	
		

}
}
