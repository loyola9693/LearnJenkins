package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.Annotations;
import pages.DeleteLeadPage;
import pages.FindLeadPage;

public class TC002_DeleteLead extends Annotations {
	
	@BeforeClass
	public void setData() {
		excelFileName = "TC002";
	}
		
	
	@Test(dataProvider="fetchData")
	private void findLeadTest(String leadID) {
		new FindLeadPage()
		.enterFirstName()
		.clickfindLeadsButton();
			
		
	}
	
	@Test(dataProvider="fetchData")
	private void deleteLeadTest() {
		new DeleteLeadPage();
				
		
	}
	
		
	
	

}
