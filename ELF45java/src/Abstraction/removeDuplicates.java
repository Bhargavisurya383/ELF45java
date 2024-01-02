package Abstraction;

import java.util.Arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 3, 3, 4, 8, 9, 1, 3, 6, 1 };

		Arrays.sort(arr);

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
		}
		int a[] = new int[arr.length - count];
		int k = 0;
		for (int i = 0; i < arr.length - count; i++) {
			if (arr[i] != arr[i + 1]) {
				a[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
