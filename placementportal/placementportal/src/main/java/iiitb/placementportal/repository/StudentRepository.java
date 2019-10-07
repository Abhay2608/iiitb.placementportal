package iiitb.placementportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import iiitb.placementportal.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
