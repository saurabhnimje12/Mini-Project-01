package Star_Pattern;

public class program_01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//o/p : 
//		*
//		**
//		***
//		****
//		*****

