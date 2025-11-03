package service;

import repository.TaskRepository;

import java.io.IOException;

public class TaskServiceImpl {
	
	private final TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) throws IOException {
		
		this.taskRepository = taskRepository;
		
	}
	
}
