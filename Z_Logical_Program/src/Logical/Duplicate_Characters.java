package Logical;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Characters {

	public static void main(String[] args) {

		m5();
	}

	private static void m1() {
		String str = "welcome to spring boot";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
					str2 += str.charAt(i);
				}
			}
		}
		System.out.println("Old : " + str);
		System.out.println("New : " + str2);
	}

	private static void m2() {
		String str = "welcome to spring boot";
		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		Set<Character> keySet = map.keySet();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (Character ch : keySet) {
			if (map.get(ch) > 1 && ch != ' ') {
				System.out.println(ch + " - repeated : " + map.get(ch));
				hashSet.add(map.get(ch));
				map2.put(ch, map.get(ch));
			}
		}
		System.out.println(hashSet);
		System.out.println(map2);
	}

	private static void m3() {
		String str = "welcome to springboot";
		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> keySet = map.keySet();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		HashSet<Integer> set = new HashSet<Integer>();
		for (Character ch : keySet) {
			if (map.get(ch) > 1 && ch != ' ') {
				set.add(map.get(ch));
				map2.put(ch, map.get(ch));

			}
		}
		System.out.println(map2);
	}

	public static void m4() {

		String str = "welcome to spring boot";
		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> keySet = map.keySet();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (Character ch : keySet) {
			if (map.get(ch) > 1 && ch != ' ') {
				map2.put(ch, map.get(ch));
			}
		}
		System.out.println(map2);

	}

	public static void m5() {

		String str = "welcome to spring boot";
		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> keySet = map.keySet();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (Character ch1 : keySet) {
			if (map.get(ch1) > 1 && ch1 != ' ') {
				map2.put(ch1, map.get(ch1));
			}
		}
		System.out.println(map2);
	}

}
