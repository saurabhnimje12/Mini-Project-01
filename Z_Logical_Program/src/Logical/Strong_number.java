package Logical;

public class Strong_number {

	public static void main(String[] args) {
		int number = 145;
		int num = number;
		int result = 0;
		int length = String.valueOf(number).length();

		while (num > 0) {
			int lastDigit = num % 10;

			int sum = 1;
			for (int i = 1; i <= lastDigit; i++) {
				sum = i * sum;
				System.out.println(sum);
			}
			result += sum;
			System.out.println(result);
			num /= 10;

		}
		if (result == number) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

// 145
// 1 + 1*2*3*4 + 1*2*3*4*5
// 1 + 24 + 120