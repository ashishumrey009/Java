
public class MaximumElement {
	
	
	  public static int  findMajority(int[] a) {
		// m stores majority element if present
			int m = -1;

			// initialize counter i with 0
			int i = 0;

			// do for each element A[j] of the array
			for (int j = 0; j < a.length; j++)
			{
				// if the counter i becomes 0
				if (i == 0)
				{
					// set the current candidate to A[j]
					m = a[j];

					// reset the counter to 1
					i = 1;
				}

				// else increment the counter if A[j] is current candidate
				else if (m == a[j]) {
					i++;
				}
				// else decrement the counter if A[j] is not current candidate
				else {
					i--;
				}
			}

			return m;
	    }
	public static void main(String[] args) {
        int a[] ={1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        System.out.println("Hello World!");
       int res= findMajority(a);
       
       System.out.println("Hello World!");
        System.out.println(res);
    }

  
}
