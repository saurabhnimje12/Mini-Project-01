package Logical;

public class Amstrong_number {

	public static void main(String[] args) {

		int number = 153;
		int result = 0;

		int num = number;
		int length = String.valueOf(number).length();

		while (num > 0) {

			int lastDigit = num % 10;
			int sum = 1;
			for (int i = 0; i < length; i++) {
				sum = sum * lastDigit;
			}
			System.out.println(sum);
			result = result + sum;

			num = num / 10;

		}

		if (number == result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}

//153
//1+125+27 = 153