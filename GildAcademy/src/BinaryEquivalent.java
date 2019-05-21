import java.util.LinkedList;
import java.util.Queue;

public class BinaryEquivalent {

	public static void printBinary(int x) {
		int count =x;
		int y;
		Queue<Integer> myNumbers = new LinkedList<Integer>();
		myNumbers.add(1);
		while(count>0) {
			y=myNumbers.remove();
			System.out.println(y);
			myNumbers.add(y*10);
			myNumbers.add(y*10+1);
			count--;
		}

	}
	
	
	public static void main(String[] args) {
		int val=2;
		printBinary(5);
	}
}
