
public class HeapSort {

	public void heapify(int arr[],int i) {
		
		int l= 2*i;
		int r=2*i+1;
		int max=i;
		
		if(l<=arr[0] && arr[l]>arr[max]) {
			max=l;
		}
		if(r<=arr[0] && arr[r]>arr[max]) {
			max=r;
		}
		if(max!=i) {
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapify(arr,max);
			
		}
	}
	
	public void buildheap(int arr[]) {
		
		for(int i=(arr[0]/2);i>=1;i-- ) {
			heapify(arr,i);
		}
	}
	
	public void heapsort(int arr[]) {
		
		
		buildheap(arr);
		for(int i=arr[0];i>=1;i--) {
			int t= arr[i];
			arr[0]=arr[i];
			arr[i] =t;
			arr[0] -=1;
			heapify(arr,1);
		}
	}
	static void printArray(int arr[]) 
    { 
       
        for (int i=1; i<=arr[0]; i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		System.out.println("=====Heap=====");
		 int arr[] = {6,12, 11, 13, 5, 6, 7}; 
	     
	     HeapSort hs=new HeapSort();
	     System.out.println("Before Sorting array is======="); 
	     hs.printArray(arr);
	     hs.heapsort(arr);
	     System.out.println("Sorted array is======="); 
	     hs.printArray(arr);
	     
	}
}
