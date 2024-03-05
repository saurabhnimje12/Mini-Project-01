package Logical;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate_In_String {
	public static void main(String[] args) {
		m3();
	}

	private static void m1() {
		String s = "I am a java developer working on a java";

		List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());
		System.out.println(collect);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String str : collect) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		Set<String> hasSet = map.keySet();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		HashSet<String> set = new HashSet<String>();
		for (String str : hasSet) {
			if (map.get(str) > 1 && str != " ") {
				set.add(str);
				map2.put(str, map.get(str));
			}
		}
		System.out.println(map2);
	}

	public static void m2() {

		String str = "I am a java developer working on a java";

		List<String> collect = Arrays.stream(str.split(" ")).collect(Collectors.toList());

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String str1 : collect) {
			if (map.containsKey(str1)) {
				map.put(str1, map.get(str1) + 1);
			} else {
				map.put(str1, 1);
			}
		}

		System.out.println(map);
		Set<String> keySet = map.keySet();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		for (String str2 : keySet) {
			if (map.get(str2) > 1) {
				map2.put(str2, map.get(str2));
			}
		}
		System.out.println(map2);
	}

	public static void m3() {

		String s = "I am a java developer working on a java";
		List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String str : collect) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		Set<String> keySet = map.keySet();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		for (String str : keySet) {
			if (map.get(str) > 1) {
				map2.put(str, map.get(str));
			}
		}
		System.out.println(map2);
	}

//List<String> collect =	Arrays.stream(s.split(" ")).collect(Collectors.tolist());

}