
public class SelectionSort {

	public static void SelectionSort(int a[], int low, int high) {
		for(int j=0;j<high;j++) {
			for(int i =j+1;i<high-1;i++) {
				int small= j;
				if(a[small]>a[i]) {
					small=j;
				}
				
				a[j]=small;
			}
			
			
			
		}
		for (int k = 0; k < high; k++) {
			System.out.print(" "+a[k]);

		}

	}

	public static void main(String args[]) {
		int a[] = { 20, 10, 40, 2 ,90,-1};
		
		int low = 0;
		int high = a.length;
		
		SelectionSort(a, low, high);

	}
}
