package String;

public class Program_02 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "java";

		int count = 0;
		String s3 = s1.concat(s2);
		for (int i = 0; i < s3.length(); i++) {

			if (s3.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total Count = " + count);
	}
}

//	 Java Program to count the total number of characters in a string 2