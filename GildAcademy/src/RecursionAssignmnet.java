
public class RecursionAssignmnet {

	public static void printPattern(int n) {
		
		if(n<=0) {
			System.out.println(n);
			return;
		}
			System.out.println(n);
			printPattern(n-5);
			System.out.println(n);
			
		
	}
	public static void printnextPatter(int m){
		if(m==0) {
			System.out.println(m);
			return;
		}
		System.out.println(m);
		printPattern(m-5);
		System.out.println(m);
	}
	
	
	public static void main(String[] args) {
		int n=16;
		int m=10;
		printPattern(n);
		printPattern(m);
		//printnextPatter(m);
	}
}
