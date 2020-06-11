package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public  class JVMReport {

public static  void generater(String json) {

	File f =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
	
	Configuration con= new Configuration(f, "Addactin app");
	con.addClassifications("platform","windows");
	con.addClassifications("Browser", "Firefox");
	con.addClassifications("Test Type", "Rgression");
	con.addClassifications("Author", "Monu");
	
	List<String> jsonfiles= new ArrayList<String>();
	jsonfiles.add(json);
	
	ReportBuilder r =new ReportBuilder(jsonfiles, con);
	r.generateReports();
	System.out.println("Reports Generated");
}
}