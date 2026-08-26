public class Main {
	public static void main(String[] args) {
		int[] arr = {9, 7, 8, 1, 3, 6, 4};

		heapSort(arr);

		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	static void heapSort(int[] arr) {
		for (int parent = arr.length / 2 - 1; parent >= 0; parent--) {
			heapify(arr, arr.length, parent);
		}

		for (int end = arr.length - 1; end > 0; end--) {
			int largest = arr[0];
			arr[0] = arr[end];
			arr[end] = largest;

			heapify(arr, end, 0);
		}
	}

	static void heapify(int[] arr, int heapSize, int parent) {
		int largest = parent;
		int leftChild = 2 * parent + 1;
		int rightChild = 2 * parent + 2;

		if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}

		if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}

		if (largest != parent) {
			int value = arr[parent];
			arr[parent] = arr[largest];
			arr[largest] = value;

			heapify(arr, heapSize, largest);
		}
	}
}
