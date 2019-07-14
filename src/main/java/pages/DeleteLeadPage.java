package pages;

import libraries.Annotations;

public class DeleteLeadPage extends Annotations {

		public  DeleteLeadPage deleteLead() {
			
		driver.findElementByLinkText("Delete").click();
		return new DeleteLeadPage();
	
		}

		
}
