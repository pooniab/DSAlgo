package array;

public class SortArraryof012 {
	public static void main(String[] args) {
		int arr [] = {1,2,1,0};
		int size = arr.length;
		sortArray(arr, size);
	}

	private static void sortArray(int[] arr, int size) {
		int i, count0 = 0, count1 = 0, count2 = 0;
		for (i = 0; i < size; i++) {
			switch (arr[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;

			}
		}
		i = 0;

		while (count0 > 0) {
			arr[i++] = 0;
			count0--;
		}
		while (count1 > 0) {
			arr[i++] = 1;
			count1--;

		}
		while (count2 > 0) {
			arr[i++] = 2;
			count2--;
		}

		logArray(arr, size);

	}

	private static void logArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {

			System.out.println(arr[i]);

		}
	}

}
