import com.fasterxml.jackson.databind.ObjectMapper;
import model.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	private static final String PATH = "tasks.json";
	private boolean isUserActive = true;
	
	ObjectMapper mapper = new ObjectMapper();
	
	/** valid pre-defined commands */
	List<String> commandList = new ArrayList<>(Arrays.asList("add",
			"update", "delete", "mark-todo", "mark-in-progress", "mark-done",
			"list", "list-todo", "list-in-progress", "list-done", "save"));
	
	List<Task> userInputCommandList =  new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		Application app = new Application();
		app.start();
	}
	
	public void start() {
		userInteractionLoop();
	}
	
	public boolean isValidCommand(String command) {
		return commandList.contains(command);
	}
	
	public Long getLatestId() {
		
		
		
		return 10L;
	}
	
	public void userInteractionLoop(){
		while (isUserActive) {
			Scanner userInput = new Scanner(System.in);
			String userInputCommand = userInput.nextLine();
			
			if (!isValidCommand(userInputCommand)) {
				System.out.println("Sorry :(, Entered command not found. Type 'help' for more information");
			} else {
				switch (userInputCommand) {
					case ("echo helloworld"): {
						System.out.println("hello world");
					}
					case ("add"): {
						Task task = new Task();
//						userInputCommandList.add(userInputCommand);
					}
					
				}
			}
			
			userInput.close();
		}
	}
	
	
}
