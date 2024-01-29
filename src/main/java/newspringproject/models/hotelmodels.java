package newspringproject.models;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;

@javax.persistence.Entity
public class hotelmodels {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@javax.persistence.Column
	private int hotelid;
	
	@javax.persistence.Column
	@NotBlank(message = "Hotel Name should not be blank")
	private String name;
	
	@javax.persistence.Column
	@javax.validation.constraints.NotBlank(message = "Address can not be blank")
	private String address;
	
	@javax.persistence.Column
	@javax.validation.constraints.Pattern(regexp = "(\\+91|0)[6-9][0-9]{9}", message = "Phone number is invalid")
	private String phone;
	
	@javax.persistence.Column
	@javax.validation.constraints.Email(message = "Email is not valid")
	private String email;
	
	@CreationTimestamp
	private Date checkinTime;
	
	@UpdateTimestamp
	private Date checkoutTime;

	
	@javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = javax.persistence.FetchType.LAZY)
	private Set<Room> rooms;
	
	
	@javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = javax.persistence.FetchType.LAZY)
	private Set<staff> staffs;

	
	
	

	
	


	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Date getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}

	public Date getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(Date checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}


	public Set<staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<staff> staffs) {
		this.staffs = staffs;
	}
	
	


	public hotelmodels(int hotelid, @javax.validation.constraints.NotBlank(message = "Hotel Name should not be blank") String name,
			@javax.validation.constraints.NotBlank(message = "Address can not be blank") String address,
			@javax.validation.constraints.Pattern(regexp = "(\\+91|0)[6-9][0-9]{9}", message = "Phone number is invalid") String phone,
			@javax.validation.constraints.Email(message = "Email is not valid") String email, Date checkinTime, Date checkoutTime, Set<Room> rooms,
			Set<staff> staffs) {
		super();
		this.hotelid = hotelid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
		this.rooms = rooms;
		this.staffs = staffs;
	}

	public hotelmodels() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
}
