import java.util.Arrays;

public class Graphimpl {
	static String arr[] = new String[] {"Atalnta","Astin","Chicago","Dallas","Denver","Huston","Washington"};
public static void main(String[] args) {
	
	int a[][] = new int [7][7];
	
	 for (int[] row : a) 
         Arrays.fill(row, 0); 
	 
	addEdge(a,0,3,200);
	display(a);
	//System.out.println(Arrays.deepToString(a)); 
}

private static void display(int[][] a) {
	// TODO Auto-generated method stub
	int row=a.length;
	int col= a[0].length;
	
	System.out.println(Arrays.deepToString(arr)); 
	
	for(int i=0;i<row;i++) {
	  for(int j=0;j<col;j++) {
		 System.out.print(" "+a[i][j] +"\t");
	  }	
	  System.out.println();
	}
	
}

public  static void addEdge(int a[][],int u, int v, int w) {
	// TODO Auto-generated method stub
	int row=a.length;
	int col= a[0].length;
	
	for(int i=0;i<row;i++) {
	  for(int j=0;j<col;j++) {
		  if(i==u && j==v) {
			  a[i][j]=w;
		  }
	  }	
	}
	
	
}
}