package Logical;

public class Remove_whitespace {

	public static void main(String[] args) {

		String str = "welcome to java";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str1 += str.charAt(i);
			}
		}
		System.out.println("Old String : " + str);
		System.out.println("New String : " + str1);
	}
}

// String str = "welcome to java";
// String str1 = str.replaceAll("\\s", ""); // Removing spaces using regular expression
//
// System.out.println("Original String: " + str);
// System.out.println("String without spaces: " + str1);
