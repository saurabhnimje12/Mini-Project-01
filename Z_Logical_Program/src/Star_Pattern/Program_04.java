package Star_Pattern;

public class Program_04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j > 0; j--) {
				System.out.print("");

			}

			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
