package com.demo.request;

import lombok.Data;

@Data
public class SearchRequest {

	private String planName;
	private String planStatus;
	private String gender;
	private String startDate;	
	private String endDate;		

} 

//	SearchRequest is a form binding class
//	when a user select the values and click on search button 
//	we should capture the data in the form of object
//	that's why we created search request