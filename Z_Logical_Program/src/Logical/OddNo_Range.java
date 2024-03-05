package Logical;

public class OddNo_Range {

	public static void main(String[] args) {

		int num = 17;

		for (int i = 0; i <= num; i++) {

			int count = 0;
			if (i % 2 == 0) {
				count++;
			}
			if (count == 1) {
				System.out.println(i);
			}

		}

	}
}
