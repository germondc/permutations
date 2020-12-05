package test.clyde.aoc.utils;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(new Integer[] { 1,2,3,4,5,6 });
		for (List<Integer> perm : new Permutations<>(items)) {
			System.out.println(perm);
		}
	}

}
