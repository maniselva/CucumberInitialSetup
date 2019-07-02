package step_definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helpers.CommonLibrary;
import steplibrary.Save_StepLibrary;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class Sugar_SaveStep extends CommonLibrary {	
	
		@Then("^User login with user credintials$")
		
		public void login (DataTable arg2) throws Exception{
		Map<String, List<String>> dataMap = null;
		dataMap = CommonLibrary.getHorizontalData(arg2);
		
		Save_StepLibrary.login(dataMap);
		
}
}