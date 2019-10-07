package iiitb.placementportal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iiitb.placementportal.repository.StudentRepository;

import iiitb.placementportal.entity.Student;
@RestController
@RequestMapping("/student")
public class StudentController {
	private StudentRepository studentRepository;

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping("/all")
	public List<Student> getAll(){
		List<Student> students = this.studentRepository.findAll();
		return students;
	}
	
	
	@PutMapping()
	public void insert(@RequestBody Student student) {
		this.studentRepository.insert(student);
	}
	
	
	@PostMapping()
	public void update(@RequestBody Student student) {
		this.studentRepository.save(student);
	}
	
}
