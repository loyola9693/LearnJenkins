package pages;

import libraries.Annotations;

public class FindLeadPage extends Annotations {
	
	public FindLeadPage enterFirstName() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("babu");
		return this;
	}
	
	public FindLeadPage clickfindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public DeleteLeadPage dataClick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new DeleteLeadPage();
	}

	
	
	
	
	
	
}