
public class LLqueue {

	class Node {
		public int data;
		public Node next;
		
		Node(int val){
			this.data = val;
			this.next = null;
			}
	}

	private Node front;
	private Node rear;

	public LLqueue() {
		this.front = null;
		this.rear = null;

	}

	public boolean  isEmpty() {
		
		return (this.front == null);
	}
	
	public void enq(int x) {
		Node n = new Node(x);
		if (this.isEmpty()) {
			front = n;
			rear = n;
			return;
		} else {
			this.rear.next = n;
			this.rear = this.rear.next;
		}

	
}
	
	public void deq() {
		
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
		}
		
		else {
			this.front=this.front.next;
		}
	}
	public void show() {
		Node temp = this.front;
		System.out.print("\n");
		while(temp!=null) {
			
			System.out.print(temp.data+"  ");
			
			temp=temp.next;
		}
	}

	public static void main(String[] args) {

		LLqueue que = new LLqueue();
		que.enq(1);
		que.enq(2);
		que.enq(3);
		que.enq(4);
		que.show();
		que.deq();
		que.show();

	}

}
