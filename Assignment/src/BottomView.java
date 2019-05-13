import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class BottomView {
	Queue<Qobj> q = new LinkedList<>();
	HashMap<Integer, Integer> mapb = new HashMap<>();
	private void seebottom(Node root, int i) {
		// TODO Auto-generated method stub
		
		q.add(new Qobj(root, i));
		while(!q.isEmpty()) {
			Qobj val =q.remove();
			Node n = val.tnode;
			int lvl = val.level;
			
			mapb.put(lvl, n.data);
			if(n.left!=null) {
	    		
	    		q.add(new Qobj(n.left,lvl-1));
	    	}
	    	if(n.right!=null) {
	    		q.add(new Qobj(n.right,lvl+1));
	    	}
			
		
		
	}
		
	
	}
	private void show() {
		Set<Integer> keys = mapb.keySet();
		for (Integer key : keys) {
			System.out.print(mapb.get(key) + " ");
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
		
		BottomView bv = new BottomView();
		bv.seebottom(root,0);
		bv.show();
	}

	





	

	

}


