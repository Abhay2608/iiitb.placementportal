package iiitb.placementportal.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
	
	@Id
	private String id;
	private String rollNo;
	private String name;
	private ArrayList<Company> applied;
	private boolean internship;
	private boolean fte;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Student(String rollNo, String name, ArrayList<Company> applied, boolean internship, boolean fte) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.applied = applied;
		this.internship = internship;
		this.fte = fte;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Company> getApplied() {
		return applied;
	}
	public void setApplied(ArrayList<Company> applied) {
		this.applied = applied;
	}
	public boolean isInternship() {
		return internship;
	}
	public void setInternship(boolean internship) {
		this.internship = internship;
	}
	public boolean isFte() {
		return fte;
	}
	public void setFte(boolean fte) {
		this.fte = fte;
	}
}
