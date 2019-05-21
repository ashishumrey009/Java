public class InsertionSort {

	public static void InsertionSort(int a[], int low, int high) {
		for (int j = low + 1; j < high; j++) {
			int i = j - 1;
			int key = a[j];

			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;

			}
			a[i + 1] = key;

		}

		for (int k = 0; k < high; k++) {
			System.out.println(a[k]);

		}

	}

	public static void main(String args[]) {
		int a[] = { 20, 10, 40, 2 };

		int low = 0;
		int high = a.length;
		InsertionSort(a, low, high);

	}
}
