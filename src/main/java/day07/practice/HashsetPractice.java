package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetPractice {

	public static void main(String[] args) {

		// ArrayList stores duplicates
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(2);
		number.add(4);

		System.out.println("Using ArrayList :" + number);

		// Set stores unique elements and ignores duplication
		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(2);
		numberSet.add(3);

		System.out.println("Using Set :" + numberSet);

	}
}
