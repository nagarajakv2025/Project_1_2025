package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendaretails("dd-MM-YYY hh-mm--ss");
	
	ExtentReports report;
	ExtentTest test;
	
	ThreadLocal<ExtentTest>extentTest=new ThreadLocal<>();
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test start");
		Reporter.log(methodName+"->On Test start");
		
		//Create a field in the generated extent report
		 test = report.createTest(methodName);
		 
		 //Sets the current therad's copy of this therad-local variable to the specified value
		 extentTest.set(test);  // unique thread id
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test success");
		Reporter.log(methodName+"->On Test success");
		
		//Logging the status
	//	test.log(Status.PASS, methodName+"- test executed successfully");
		extentTest.get().log(Status.PASS, methodName+"- test executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test failure");
		Reporter.log(methodName+"->On Test failure");
		
		//Logging the status
		//test.log(Status.FAIL, methodName+"- test failed");
		extentTest.get().log(Status.FAIL, methodName+"- test failed");
		
		//Logging the throwable messages
	//	test.log(Status.INFO, result.getThrowable());
		extentTest.get().log(Status.INFO, result.getThrowable());
		
		//It will take the screenshot of the web page
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path=sUtil.takeScreenshot(BaseClass.sDriver, dateTimeStamp);
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On test Skipped");
		Reporter.log(methodName+"->On Test Skipped");
		
		//Logging the status
		//	test.log(Status.SKIP, methodName+"- test skipped");
		extentTest.get().log(Status.SKIP, methodName+"- test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Suite start");
		
		//Configuration of the Extent Report
		ExtentSparkReporter reporter = new ExtentSparkReporter("U:\\SDET\\com.crm.VTiger\\Extent Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Execution Report");
		reporter.config().setReportName("Build 1 VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Configuration of the Extent Report
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base Platform", "Testing-Env");
		report.setSystemInfo("Base browser", "chrome");
		report.setSystemInfo("Reporter", "Nagaraj");
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("On suite finish");
	
	//Flushing the report
	report.flush();
	}
}
