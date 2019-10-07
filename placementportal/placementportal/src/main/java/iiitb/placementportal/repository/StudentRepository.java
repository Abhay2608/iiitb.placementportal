package iiitb.placementportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import iiitb.placementportal.entity.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
