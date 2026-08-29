package testDetails;
import org.testng.annotations.Test;

import envSetUp.precondition;
import pageDetails.loginPage;
import utility.excelutility;

public class loginTestDetails extends precondition {
	@Test
	public void LoginTest() {
		loginPage lp = new loginPage(driver);
		
		//Reading the data from excel file by the specified path
		String xl ="C:\\Users\\ACER\\Downloads\\Untitled spreadsheet (2).xlsx";
		String sheet = "Sheet1";
		int rowCount = excelutility.getRowCount(xl, sheet);
		
		
		for(int i=1;i<=rowCount;i++)
		{
			String UserName = excelutility .getCellValue(xl, sheet, i, 0);
			System.out.println("Username : "+UserName);
			String pwd = excelutility .getCellValue(xl, sheet, i, 1);
			System.out.println("password : "+pwd);
			//passing usrname & password as parameters
			lp.setValues(UserName, pwd);
			//submitting the data by clicking on login button
			lp.loginbtn();
		
			String expectedurl ="https://practicetestautomation.com/logged-in-successfully/";
			String actualurl = driver.getCurrentUrl();
			
		 
			if(actualurl.equals(expectedurl))
			{
				System.out.println("PASS");
			}
			else 
			{
				System.out.println("FAIL");
			}
			
			
		}
	}	
}