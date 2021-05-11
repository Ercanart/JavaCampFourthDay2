package InterfaceAbstractDemo.Entities;
import java.time.LocalDate;

import InterfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity {
	
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate DateOfBirth;
	public String nationalityId;
	
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName,LocalDate DateOfBirth, String nationalityId ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.DateOfBirth =DateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}	


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}	
}
