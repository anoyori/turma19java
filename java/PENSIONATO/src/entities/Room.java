package entities;

public class Room {
	
	private String name;
	private String email;
	private int room;
	
	//constructor
	public Room(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	//methods
	public String toString() {
		return name + " , " + email;
	}

}