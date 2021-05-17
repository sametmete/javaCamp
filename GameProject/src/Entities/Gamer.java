package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Gamer implements Entity {

	public Gamer() {
		
	}
	public Gamer(int id, String lastName, String firstName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.Id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
	}
	
	
	private int Id;
	private String lastName;
	private String firstName;
	private LocalDate dateOfBirth;
	private String NationalityId;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
