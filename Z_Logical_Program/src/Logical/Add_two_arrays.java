package Logical;

import java.util.Arrays;

public class Add_two_arrays {
	public static void main(String[] args) {
		m4();
	}

	public static void m4() {
		int[] a = { 1, 3, 5, 6 };
		int[] b = { 2, 4, 7 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}

		int temp = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[j] < c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

	public static void m3() {

		int[] a = { 1, 3, 5, 6 };
		int[] b = { 2, 4, 7 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}
		System.out.println(Arrays.toString(c));
		// [1, 3, 5, 6, 2, 4, 7]

		int temp = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[j] < c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println("Output : " + Arrays.toString(c));

	}

	public static void m2() {
		// OR (Brute Force)

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}
		System.out.println(Arrays.toString(c));
	}

	public static void m1() {
		// input
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7 };
		// output
		// int[] c = {1, 2, 3, 4, 5, 6, 7};

		// Create a new array with the combined length
		int[] c = new int[a.length + b.length];

		// Copy elements from array a to array c
		System.arraycopy(a, 0, c, 0, a.length);

		// Copy elements from array b to array c, starting from the end of array a
		System.arraycopy(b, 0, c, a.length, b.length);

		// Print the result
		System.out.print("int[] c = {");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			if (i < c.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("};");
	}
}
