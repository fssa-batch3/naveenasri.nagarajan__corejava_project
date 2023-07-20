package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(9);
		numbers.add(45);
		numbers.add(12);
		numbers.add(1);
		
		System.out.println("Before Sorting: " + numbers);
		Collections.sort(numbers);
		System.out.println("After Sorting: " + numbers);
	}
}
