package Logical;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Find_Duplicate_Char {

	public static void main(String[] args) {
		m3();
	}

	public static void m1() {
		String str = "hellogoodmorning";
		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);

		Set<Character> keySet = map1.keySet();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (Character ch : keySet) {
			if (map1.get(ch) > 1) {
//				System.out.println(ch + " = " + map1.get(ch));
				map2.put(ch, map1.get(ch));
			}
		}
		System.out.println(map2);
	}

	public static void m2() {
		String s = "hellogoodmorning";
		char[] charArr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Character> keySet = map.keySet();
		Set<Integer> set = new HashSet<Integer>();
		for (Character ch : keySet) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " is repeated " + map.get(ch) + " times");
				set.add(map.get(ch));
			}
		}
		Optional<Integer> max = set.stream().max(Comparator.comparingInt(Integer::intValue));
		System.out.println(max);
	}

	public static void m3() {
		String s = "hellogoodmorning";
		char[] charArray = s.toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char ch : charArray) {
			if (map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch) + 1);
			} else {
				map1.put(ch, 1);
			}
		}

		Set<Character> keySet = map1.keySet();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (Character ch1 : keySet) {
			if (map1.get(ch1) > 1 && ch1 != ' ') {
				map2.put(ch1, map1.get(ch1));
			}
		}
		System.out.println(map2);
	}

}
