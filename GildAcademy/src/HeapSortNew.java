
public class HeapSortNew {

	
	
	
public void buildheap(int arr[]) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i-- ) {
			heapify(arr,n,i);
		}
	}
void heapify(int arr[], int n, int i) 
{ 
    int largest = i;  
    int l = 2*i + 1; 
    int r = 2*i + 2; 
   
    if (l < n && arr[l] > arr[largest]) 
        largest = l; 

    
    if (r < n && arr[r] > arr[largest]) 
        largest = r; 

    
    if (largest != i) 
    { 
        int swap = arr[i]; 
        arr[i] = arr[largest]; 
        arr[largest] = swap; 

        
        heapify(arr, n, largest); 
    } 
} 
public void heapsort(int arr[]) {
	int n = arr.length; 
		
		buildheap(arr);
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
			heapify(arr,i,0);
		}
	}
	static void printArray(int arr[]) 
    { 
       
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	public static void main(String[] args) {
		System.out.println("=====Heap=====");
		 int arr[] = {12, 11, 13, 5, 6, 7}; 
	     
		 HeapSortNew hs=new HeapSortNew();
	     System.out.println("Before Sorting array is======="); 
	     hs.printArray(arr);
	     hs.heapsort(arr);
	     System.out.println("Sorted array is======="); 
	     hs.printArray(arr);
	     
	}
}
