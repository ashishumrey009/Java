import java.util.Arrays;

public class DiffArray {

	public static void Diff(int a[], int low, int high) {
		Arrays.sort(a);
		
		
		int  minCost=Integer.MAX_VALUE;
		for(int i=0;i<high-1;i++) {
			 minCost= Integer.min(a[i+1]-a[i], minCost);
			
		}
		 System.out.println(minCost);
	}

	public static void main(String args[]) {
		int a[] = { 1, 5, 3, 19, 18, 25};
		String num1= "10";
		String num2 = "2";
		int low = 0;
		int high = a.length;
		
		Diff(a, low, high);

	}
	
}
