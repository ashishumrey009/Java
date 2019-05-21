
public class BinarySearch {
	
	public static int  BinarySearch(int a[],int low ,int high,int x) {
		
		while(low<=high) 
		{
			int mid=low+(high-1)/2;
			if(a[mid]==x) {
				return mid;
			}
			if(a[mid]<x) 
			{
				low=mid+1;
			}
			else if(a[mid]>x) {
				high=mid+1;
			}
		}
		
		return -1;
		
		
	}

	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70};
		int val = 60;
		int low = 0;
		int high = a.length;
		int result=BinarySearch(a,low,high-1,val);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at Position :"+result);
	}
	
}
