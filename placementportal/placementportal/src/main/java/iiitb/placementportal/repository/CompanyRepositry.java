package iiitb.placementportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import iiitb.placementportal.entity.Company;


@Repository
public interface CompanyRepositry extends MongoRepository<Company, String> {

}
