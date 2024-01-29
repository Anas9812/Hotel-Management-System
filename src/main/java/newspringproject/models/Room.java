package newspringproject.models;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

@javax.persistence.Entity
public class Room {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@javax.persistence.Column
	private int roomId;

	@javax.persistence.Column
	private String roomType;

	@javax.persistence.Column
	private int price;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Room(int roomId, String roomType, int price) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	
	
	
	
	
	
}

