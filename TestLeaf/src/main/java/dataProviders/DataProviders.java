package dataProviders;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="fetchdata")
	public static Object[][] getdata() throws InvalidFormatException, IOException {
		
		return CreateleadExcel.readExcel();
		
	}

}
