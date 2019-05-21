
public class BubbleSort {

	public static void BubbleSort(int a[], int low, int high) {
		for(int i=0;i<high;i++) {
			for(int j=0;j<high;j++) {
				if(a[i]<a[j]) {
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
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
		
		BubbleSort(a, low, high);

	}
}
