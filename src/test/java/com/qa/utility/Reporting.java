package com.qa.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting  extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports xReports;
	public ExtentTest xTest;
	
	 
	  public void onStart(ITestContext testContext) {
		  String dateStamp = new SimpleDateFormat("yyyy.MM.dd.HH.ss").format(new Date());
		  String repName = "Test-Automation-Report" + dateStamp + ".html";
		  
		  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/"+ repName);
		  htmlReporter.config().setDocumentTitle("Automation Tesring");
		  htmlReporter.config().setReportName("Functional Testing");
		  htmlReporter.config().setTheme(Theme.DARK);
		  
		  xReports = new ExtentReports();
		  xReports.attachReporter(htmlReporter);
		  xReports.setSystemInfo("QA Name", "Jyoti");
		  xReports.setSystemInfo("hostname", "localhost");
		  xReports.setSystemInfo("OS", "WINDOWS10");
		  
		  
	   
	  }
	  public void onFinish(ITestContext testContext) {
		  xReports.flush();
	  }


	 
	  public void onTestSuccess(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.PASS, "Test is passed");
		  xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	   
	  }

	 
	  public void onTestFailure(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.FAIL, "Test is failure");
		  xTest.log(Status.FAIL, tr.getThrowable());
		  xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	   
	  }
	  public void onTestSkipped(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.SKIP, "Test is skipped");
		  xTest.log(Status.SKIP, tr.getThrowable());
		  xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
	   
	  }

	 

}



