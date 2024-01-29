package newspringproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;


@Entity
public class staff {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int staffid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String position;
	
	@Column
	private int salary;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	
	
	
	

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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
	

	
		public staff(int staffid, String firstname, String lastname, String position, int salary, String phone,
			String email) {
		super();
		this.staffid = staffid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.salary = salary;
		this.phone = phone;
		this.email = email;
	}

		public staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
