package day05.solved.package02;

import day05.solved.package01.*;

public class SomeOtherClass {

	public static void main(String[] args) {
		try {
			Rectangle rectangle = new Rectangle(1.0, 1.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}