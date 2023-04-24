package com.example.sample.Service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.Model.Persons;
import com.example.sample.Repository.PersonRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportService {

	@Autowired
	private PersonRepository personrepo;
	
	
	public void generateExcel(HttpServletResponse response)throws Exception	 {
		
		List<Persons> person =  personrepo.findAll();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet =  workbook.createSheet("Person Info");
		HSSFRow row= sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("name");
		row.createCell(2).setCellValue("City");
		
		int DataRowIndex = 1;
		
		
		for(Persons per : person) {
			HSSFRow dataRow =  sheet.createRow(DataRowIndex);
			dataRow.createCell(0).setCellValue(per.getId());
			dataRow.createCell(1).setCellValue(per.getName());
			dataRow.createCell(2).setCellValue(per.getCity());
			DataRowIndex++;
		}
		
		ServletOutputStream ops =  response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
		
		
	}
	
	
}
