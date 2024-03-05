package String;

public class Program_01 {

	public static void main(String[] args) {

		String s = "hello saurabh";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total Count = "+count);
	}
}

//	Java Program to count the total number of characters in a string
