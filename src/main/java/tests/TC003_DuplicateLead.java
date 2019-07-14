package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.Annotations;
import pages.FindLeadPage;

public class TC003_DuplicateLead extends Annotations {
	
	@BeforeClass
	public void setData() {
		excelFileName = "TC003";
	}
		
	
	@Test(dataProvider="fetchData")
	private void duplicateLeadTest(String leadID) {
		new FindLeadPage()
		.enterFirstName()
		.clickfindLeadsButton()
		.clickDuplicateLeadsButton()
		.submitDuplicateLeadsButton();
	}
}
