
public class LCS {
	public static void main(String[] args) {
		String a="dabc";
		String b = "aebc";
		char []str1= a.toCharArray();
		char []str2 = b.toCharArray();
		
		int m= str1.length-1;
		int n =str2.length-1;
		System.out.println(helperlcs(str1,str2,m,n));
	}

	public static int helperlcs(char[] a, char[] b, int i, int j) {
		// TODO Auto-generated method stub
		if(i==0 ||j==0)
			return 0;
		
		if(a[i]==a[j]) {
			int val =1+ helperlcs(a, b, i-1, j-1);
			return val;
			
		}
		
			
	return Math.max(helperlcs(a, b, i-1, j), helperlcs(a, b, i, j-1));
		
		
	}

}
