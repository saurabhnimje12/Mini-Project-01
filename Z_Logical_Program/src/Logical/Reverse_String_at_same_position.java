package Logical;

public class Reverse_String_at_same_position {

	public static void main(String[] args) {

		String str = "welcome to springboot";
		String[] str1 = str.split(" ");

		StringBuilder builder = new StringBuilder();

		for (int i = str1.length - 1; i >= 0; i--) {
			builder.append(str1[i]);
			if (i > 0) {
				builder.append(" ");
			}
		}
		System.out.println(builder);
	}
}
