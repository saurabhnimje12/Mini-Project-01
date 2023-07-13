package com.demo.service;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.demo.entity.CitizenPlan;
import com.demo.repo.CitizenPlanRepository;
import com.demo.request.SearchRequest;
import com.demo.util.EmailUtils;
import com.demo.util.ExcelGenerator;
import com.demo.util.PdfGenerator;

@Service
public class ReportServiceIMPL implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;

	@Autowired
	private ExcelGenerator excelGenerator;

	@Autowired
	private PdfGenerator pdfGenerator;

	@Autowired
	private EmailUtils emailUtils;

	@Override
	public List<String> getPlanNames() {
		return planRepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return planRepo.getPlanStatus();
	}

	CitizenPlan entity = new CitizenPlan();

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// we need to copy the data from binding object to entity object
		// for dynamic query generate

		if (null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if (null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}
		if (null != request.getStartDate() && !"".equals(request.getStartDate())) {
			String startDate = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// converting String to LocalDate
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		}
		if (null != request.getEndDate() && !"".equals(request.getEndDate())) {
			String endDate = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// converting String to LocalDate
			LocalDate localDate = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localDate);
		}
		return planRepo.findAll(Example.of(entity));
	}

	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {

		File file = new File("Plans.xls");

		List<CitizenPlan> plans = planRepo.findAll(Example.of(entity));
		excelGenerator.generate(response, plans, file);

		String subject = "Test mail subject";
		String body = "<h1>EXCEL Test mail subject</h1>";
		String to = "saurabhnimje01@gmail.com";

		emailUtils.sendEmail(subject, body, to, file);
		file.delete();

		return true;
	}

	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {

		File file = new File("Plans.pdf");
		
		List<CitizenPlan> plans = planRepo.findAll(Example.of(entity));
		pdfGenerator.generate(response, plans, file);

		String subject = "Test mail subject";
		String body = "<h1>PDF Test mail subject</h1>";
		String to = "saurabhnimje01@gmail.com";

		emailUtils.sendEmail(subject, body, to, file);
		file.delete();

		return true;
	}
}
