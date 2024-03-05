package Logical;

public class PrimeNo_Range {

	public static void main(String[] args) {

	}

	public static void m2() {
		int num = 17;

		for (int i = 1; i <= num; i++) {
			if (i % 1 == 0) {
				int count = 0;
				count++;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i);
				}
			}
		}
	}

	public static void m1() {
		int num = 17;

		for (int i = 1; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Prime No is " + i);
			}
		}
	}
}
