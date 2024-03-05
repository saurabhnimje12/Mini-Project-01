package Logical;

public class Count_characters {

	public static void main(String[] args) {

		m2();
	}

	public static void m2() {
		String str = "welcome to java";
		String str1 = "";
		char[] charArray = str.toCharArray();
		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				count++;
				str1 += charArray[i];
			}
		}
		System.out.println(count);
		System.out.println(str1);

	}

	public static void m1() {
		String str = "welcome to java";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				count++;
			}
		}
		System.out.println("COUNT : " + count);
	}
}
