import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Array {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int row= arr[0].length;
	int col = arr.length;
	private static int max = 0;
	HashMap<Integer,LinkedList<Integer>> map = new HashMap();
	Map<Integer,Integer> count = new HashMap<Integer, Integer>();
	
	public void add(int x) {
		if(count.containsKey(x)) {
			count.put(x, count.get(x)+1);
		}
		else {
			count.put(x,1);
		}
		
		int fq= count.get(x);
		map.putIfAbsent(fq, new LinkedList<>());
		map.get(fq).add(x);
		max = Math.max(max, fq);
	}
	
	public void show() {
		
		count.forEach((k,v)->System.out.println("key="+k+"value="+v));
	}
	public void show2() {
		for(Map.Entry<Integer,LinkedList<Integer>> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
	}
	
	public void pop() {
		while(!map.containsKey(max)) {
			max--;
		}
		LinkedList<Integer> ls = map.get(max);
		int popped = ls.removeLast();
		System.out.println("poped value is "+popped);
		count.put(popped, max - 1);
		if (ls.isEmpty()) map.remove(max);
	}
	public static void main(String[] args) {
		
		Array ar = new Array();
		ar.add(1);
		ar.add(1);
		ar.add(1);
		ar.show();
		ar.show2();
		System.out.println("value of max is "+max);
		ar.pop();
		ar.show();
		ar.show2();
		System.out.println("value of max is "+max);
		ar.pop();
		ar.show();
		ar.show2();
		System.out.println("value of max is "+max);
		
	}

	
	
	
}
