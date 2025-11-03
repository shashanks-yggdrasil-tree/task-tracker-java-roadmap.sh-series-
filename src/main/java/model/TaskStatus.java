package model;

public enum TaskStatus {
	DONE("Done"),
	TODO("Todo"),
	IN_PROGRESS("In Progress");
	
	private final String displayName;
	
	TaskStatus(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
}
