package Star_Pattern;

public class Program_03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 5; i >= 0; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//o/p :
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*

