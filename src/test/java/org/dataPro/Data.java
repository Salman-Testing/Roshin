package org.dataPro;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "ValidCredentials")
	private Object[][] data() {
		return new Object[][] {

				{ "Automation", "Atm@1234" }, 
				{ "Facebook", "Facebook@1234" },
				{ "Snapdeal", "Snapdeal@1234" }

		};

	}
	
	@DataProvider (name="Product")
	private Object[][] data1() {
		return new Object[][] {
			{"iphone"},
			{"micromax"},
			{"one plus"},
			{"realme"}
			
		};

	}

}
