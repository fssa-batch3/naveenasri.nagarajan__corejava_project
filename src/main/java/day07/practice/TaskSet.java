package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class TaskSet {
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 20)));
		taskList.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 21)));
		taskList.add(new Task(3, "Task 1", LocalDate.of(2023, 7, 20)));
		taskList.add(new Task(4, "Task 2", LocalDate.of(2023, 7, 21)));
		taskList.add(new Task(5, "Task 1", LocalDate.of(2023, 7, 20)));

		HashSet<Task> taskSet = new HashSet<>(taskList);
		taskList.clear();
		taskList.addAll(taskSet);

		System.out.println(taskList);
	}
}

class Task {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Task{" + "id=" + id + ", name='" + name + '\'' + ", deadline=" + deadline + '}';
	}
}