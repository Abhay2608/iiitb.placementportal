package iiitb.placementportal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iiitb.placementportal.repository.CompanyRepositry;

import iiitb.placementportal.entity.Company;
@RestController
@RequestMapping("/company")
public class CompanyController {
	private CompanyRepositry companyRepositry;

	public CompanyController(CompanyRepositry companyRepositry) {
		this.companyRepositry = companyRepositry;
	}
	
	@GetMapping("/all")
	public List<Company> getAll(){
		List<Company> companies = this.companyRepositry.findAll();
		return companies;
	}
	
	
	@PutMapping()
	public void insert(@RequestBody Company company) {
		this.companyRepositry.insert(company);
	}
	
	
	@PostMapping()
	public void update(@RequestBody Company company) {
		this.companyRepositry.save(company);
	}
}
