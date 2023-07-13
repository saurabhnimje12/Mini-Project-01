package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.CitizenPlan;
import com.demo.request.SearchRequest;
import com.demo.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService service;

	public void init(Model model) {
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}

	/*
	 * this method is used to load index page model is used to send the data from
	 * controller to UI "new SearchRequest()" sending binding object to UI
	 * 
	 * @param model return String
	 */
	@GetMapping("/")
	public String indexPade(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}

	@PostMapping("/searchData")
	public String handleSearch(@ModelAttribute("search") SearchRequest request, Model model) {
		List<CitizenPlan> plans = service.search(request);
		model.addAttribute("plans", plans);
		// model.addAttribute("search", search);
		init(model);
		return "index";
	}

	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		response.addHeader("Content-Disposition", "attachment;filename=plans.xls");
		service.exportExcel(response);
	}

	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		response.addHeader("Content-Disposition", "attachment;filename=plans.pdf");
		service.exportPdf(response);
	}

}
