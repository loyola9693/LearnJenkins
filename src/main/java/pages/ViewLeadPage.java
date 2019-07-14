package pages;

import libraries.Annotations;

public class ViewLeadPage extends Annotations {
	
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElementById("viewLead_firstName_sp")
		.getText();
		if(text.equals("Sethu")) {
			System.out.println("First name matches with input data");
		}else {
			System.err.println("First name not matches with input data");
		}
		return this;
	}

	
	
	
	
	
	
}
