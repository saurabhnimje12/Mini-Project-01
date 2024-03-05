package Logical;

public class Sum_to_single_digit {

	public static void main(String[] args) {

		int number = 1234;
		int num = number;
		int result = 0;
	
		do {

			while (num > 0) {
				int last = num % 10;// 4
				result += last; // 4
				num /= 10; // 123
			}
			System.out.println(result);
			num = result;
		} while (num > 9);

		System.out.println(result);
	}

}
