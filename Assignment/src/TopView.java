import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class TopView {

	 Queue<Qobj> q= new LinkedList<>();
	public static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	static int min=0;
	static int max=0;
	
	public void seetop(Node root,int level) {
    if(root==null)
    	return;
    
    q.add(new Qobj(root,level));
    while(!q.isEmpty()) {
    	Qobj ob= q.remove();
    	Node node = ob.tnode;
    	int lvl = ob.level;
    	 max= Math.max(lvl,max);
    	 min= Math.min(min, lvl);
    	
    	if(map.containsKey(lvl)) {
    		
    	}
    	else {
    		System.out.print(node.data+"  ");
    		map.put(lvl, node.data);
    	}
    	
    	if(node.left!=null) {
    		//map.put(lvl-1, node.data);
    		q.add(new Qobj(node.left,lvl-1));
    	}
    	if(node.right!=null) {
    		q.add(new Qobj(node.right,lvl+1));
    	}
    }
	
	}
	
	public void show() {
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		System.out.println("========");
		for(Object key:keys) {
			
			System.out.print(map.get(key)+" ");
//			//System.out.println(entry.getKey()+" ====>  "+entry.getValue()+" ");
//			if()
		}
		
		 
	}
	public static void main(String[] args) {
		Node root= new Node(1);
		root.left=new Node(2);
		root.right= new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		TopView tv = new TopView();
		tv.seetop(root,0);
		//System.out.println("==============");
		tv.show();
		System.out.println("\n");
		System.out.println("Maximum value is "+max  +"    "+"Min value is "+min);
	}
	
	
}
class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
}

class Qobj{
	int level;
	Node tnode;
	
	public Qobj(Node  node,int l) {
		this.level=l;
		this.tnode=node;
	}
}