
public class HeapClient {
public static void main(String[] args) {
	Heap heap = new Heap();
	heap.addItem(10);
	heap.display();
	heap.addItem(20);
	heap.display();
	heap.addItem(30);
	heap.display();
	heap.addItem(40);
	heap.display();
	heap.addItem(5);
	heap.display();
	heap.addItem(3);
	heap.display();
	
	System.out.println(heap.remove());
	heap.display();
	System.out.println(heap.remove());
	heap.display();
	System.out.println(heap.remove());
	heap.display();
	
}
}
