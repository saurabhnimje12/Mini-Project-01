package Logical;

public class Check_two_array_equals {
	public static void main(String[] args) {
		m2();
	}

	public static void m2() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
		boolean flag = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
				}
			}
		}

		if (flag == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equals");
		}
	}

	public static void m1() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
		boolean equalornot = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					equalornot = false;
				}
			}
		} else {
			equalornot = false;
		}
		if (equalornot == true) {
			System.out.println("Two arrays are equals");
		} else {
			System.out.println("Two arrays are not equals");
		}
	}
}
