package Logical;

public class Reverse_String {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "";

		// Iterate the String and print reverse
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println("String : " + str2);
	}
}
