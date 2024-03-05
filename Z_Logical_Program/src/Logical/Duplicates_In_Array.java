package Logical;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicates_In_Array {
	public static void main(String[] args) {

		m3();
	}

	private static void m1() {
		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };

		HashSet<Integer> set = new HashSet<Integer>();

		for (int element : inputArray) {
			if (!set.add(element)) {
				System.out.println("Duplicate Element : " + element);
			}
		}
		System.out.println(set);
	}

	public static void m2() {

		int[] a = { 111, 333, 555, 777, 333, 444, 555 };

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					hashSet.add(a[j]);
				} else {
					System.out.println("Duplicate element : " + a[j]);
				}
			}
		}
		System.out.println(hashSet);
	}

	public static void m3() {

		int[] a = { 111, 333, 555, 777, 333, 444, 555 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
