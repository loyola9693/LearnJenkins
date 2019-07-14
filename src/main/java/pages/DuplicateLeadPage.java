package pages;
import libraries.Annotations;

public class DuplicateLeadPage extends Annotations {
	
			
		public DuplicateLeadPage enterFirstName() {
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("babu");
			return this;
		}
		
		public DuplicateLeadPage clickfindLeadsButton() {
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			return this;
		}
		
		public DuplicateLeadPage clickDuplicateLeadsButton() {
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			driver.findElementByLinkText("Duplicate Lead").click();
			return this;
		}
		
		public DuplicateLeadPage submitDuplicateLeadsButton() {
			driver.findElementByName("submitButton").click();
			return this;
		}
		
		
		}



