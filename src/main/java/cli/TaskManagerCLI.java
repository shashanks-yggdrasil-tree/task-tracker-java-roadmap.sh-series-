package cli;

import service.TaskService;

public class TaskManagerCLI {
	
	private final TaskService taskService;
	
	public TaskManagerCLI(TaskService taskService) {
		this.taskService = taskService;
	}
}
