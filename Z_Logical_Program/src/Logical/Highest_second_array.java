package Logical;

import java.util.Arrays;

public class Highest_second_array {

	public static void thirdHighest() {

		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {
					int t = array[j];
					array[j] = array[i];
					array[i] = t;
				}
			}

		}
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length - 3]);
	}

	public static void main(String[] args) {
		thirdHighest();
		int[] array = { 1, 2, 3, 4, 5 };
// 2,1,
		int first, second;

		if (array[0] > array[1]) {
			first = array[0];
			second = array[1];
		} else {
			first = array[1];
			second = array[0];
		}

		for (int i = 2; i < array.length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];
			} else if (array[i] > first && array[i] < second) {

				second = array[i];
			}
		}
		System.out.println(second);
	}
}
