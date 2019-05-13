import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>>  {
	ArrayList<T>  data = new ArrayList<>();

	public void addItem(T item) {
		data.add(item);
		//System.out.println(data.size()-1);
		heapify(data.size()-1);
	}

	private void heapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(isLarger(data.get(ci), data.get(pi))>0) {
			swap(pi,ci);
			heapify(pi);
		}
		
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		T i = data.get(pi);
		T j = data.get(ci);
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
	public T remove() {
		swap(0,data.size()-1);
		T rv = this.data.remove(this.data.size()-1);
		downheapify(0);
		
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lc  = 2*pi + 1;
		int rc =  2*pi + 2;
		
		int mini=pi;
		if(lc<data.size() && isLarger(data.get(lc), data.get(rc))>0) {
			mini= lc;
		}
		if(rc< data.size() && isLarger(data.get(rc), data.get(lc))>0) {
			mini = rc;
		}
		if(mini!=pi) {
			swap(pi,mini);
			downheapify(mini);
		}
	}
	public T get () {
		return this.data.get(0);
	}
	
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}
}
