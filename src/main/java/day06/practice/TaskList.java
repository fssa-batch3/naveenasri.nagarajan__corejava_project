package day06.practice;

import java.util.ArrayList;;

public class TaskList {

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.taskName.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Task> tasks = new ArrayList<Task>();
		// Add tasks to the list...

		boolean found = findTaskByName("Task 1", tasks);
		System.out.println(found);
	}
}
