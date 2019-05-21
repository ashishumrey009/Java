import java.util.Arrays;

public class Fibbo {
	static int[] arr = new int[100];
	
public static void main(String[] args) {
	
	Arrays.fill(arr, -1);
	 arr[0]=0;
	 arr[1]=1;
	int n=3;
	int res = fib(n);
	
	 
	 System.out.println("fib of "+n+"th number is "+res);
}
	
public static int fib(int n) {
	 
	
	if(n==1 || n==0)
		return arr[n];
	if (arr[n-1]==-1) {
		arr[n-1]=fib(n-1);
	}
	if (arr[n-2]==-1) {
		arr[n-2]=fib(n-2);
	}
		
	arr[n]=arr[n-1]+arr[n-2];
	return arr[n];
}
}
