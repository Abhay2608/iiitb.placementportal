package iiitb.placementportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import iiitb.placementportal.entity.Company;

public interface CompanyRepositry extends MongoRepository<Company, String> {

}
