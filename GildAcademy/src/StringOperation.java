import java.util.Arrays;

public class StringOperation {
	public static boolean findMax(int a, int b) {
		String str1,str2;
		str1 =Integer.toString(a)+ Integer.toString(b); 
	     str2 = Integer.toString(b)+Integer.toString(a); 
		System.out.println(str1);
		System.out.println(str2);
		int result1 = Integer.parseInt(str1);
		int result2 = Integer.parseInt(str2);
		//System.out.println((str1>str2));
		
		boolean result = result2 > result1;
		return result;
		//System.out.println(result);
	}

	public static void main(String args[]) {
		int a[] = { 1, 5, 3, 19, 18, 25};
		int num1= 10;
		int  num2 = 2;
		int low = 0;
		int high = a.length;
		
		findMax(10,2);

	}
}
