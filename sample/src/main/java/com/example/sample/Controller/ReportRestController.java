package com.example.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Model.Persons;
import com.example.sample.Repository.PersonRepository;
import com.example.sample.Service.PersonService;
import com.example.sample.Service.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {
	
	
	@Autowired
	private ReportService reportService;
	
	
	@Autowired
	private PersonRepository personrepo;
	
	@Autowired
	private PersonService perservice;
	
	
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response, Persons person)throws Exception {
		
		personrepo.save(person);
		
		response.setContentType("application/octet-stream");
		
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename = person.xls";
		
		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
		
	}
	
	@GetMapping("/exceldelete")
	public void generatedeleteExcelReport(HttpServletResponse response, @RequestParam("id") int id )throws Exception {
		
		perservice.deleteEmployeeById(id);
		
		response.setContentType("application/octet-stream");
		
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename = person.xls";
		
		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
		
	}
	
	

}
