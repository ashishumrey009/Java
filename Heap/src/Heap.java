import java.util.ArrayList;

public class Heap {
ArrayList<Integer>  data = new ArrayList<>();

public void addItem(int item) {
	data.add(item);
	//System.out.println(data.size()-1);
	heapify(data.size()-1);
}

private void heapify(int ci) {
	// TODO Auto-generated method stub
	int pi = (ci-1)/2;
	if(data.get(ci)<data.get(pi)) {
		swap(pi,ci);
		heapify(pi);
	}
	
}

private void swap(int pi, int ci) {
	// TODO Auto-generated method stub
	int i = data.get(pi);
	int j = data.get(ci);
	data.set(pi, j);
	data.set(ci, i);
	
}
public void display() {
	System.out.println(data);
}

public int size() {
	return this.data.size();
}

public boolean isEmpty() {
	return data.size()==0;
}
public int remove() {
	swap(0,data.size()-1);
	int rv = this.data.remove(this.data.size()-1);
	downheapify(0);
	
	return rv;
}

private void downheapify(int pi) {
	// TODO Auto-generated method stub
	int lc  = 2*pi + 1;
	int rc =  2*pi + 2;
	
	int mini=pi;
	if(lc<data.size() && data.get(lc)<data.get(mini)) {
		mini= lc;
	}
	if(rc< data.size() && data.get(rc)<data.get(mini)) {
		mini = rc;
	}
	if(mini!=pi) {
		swap(pi,mini);
		downheapify(mini);
	}
}
public int get () {
	return this.data.get(0);
}
}
