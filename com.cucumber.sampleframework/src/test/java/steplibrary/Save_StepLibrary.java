package steplibrary;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;

import constant.SaveE2E_Constant;
import helpers.CommonLibrary;

public class Save_StepLibrary extends CommonLibrary {
	public Save_StepLibrary() throws ConfigurationException, IOException {
		super(); 
		}

	public static void login(Map<String, List<String>> dataMap) throws Exception {
		String usrName = getXLSTestData(dataMap.get("InputFileName").get(0), dataMap.get("SheetName").get(0),
				dataMap.get("RowId").get(0), "UserName");
		String passWord = getXLSTestData(dataMap.get("InputFileName").get(0), dataMap.get("SheetName").get(0),
				dataMap.get("RowId").get(0), "Password");
		
		
				
		if (isElementPresentVerifyClick(SaveE2E_Constant.uname)) {
			if (!clearAndEnterText(SaveE2E_Constant.uname, usrName)) {
				throw new Exception("User Not able to Enter Username");
			}
		} else {
			throw new Exception("Username Entered");
		}
		if (isElementPresentVerification(SaveE2E_Constant.pass)) {
			if (!clearAndEnterText(SaveE2E_Constant.pass, passWord)) {
				throw new Exception("User Not able to Enter password");
			}
		} else {
			throw new Exception("Element Not Verified");
		}

		System.out.println("Password Entered");
		if (isElementPresentVerification(SaveE2E_Constant.logbtn)) {
			if (!isElementPresentVerifyClick(SaveE2E_Constant.logbtn)) {
				throw new Exception("User Not able to click login button");
			}
		} else {
			throw new Exception("Element Not Verified");
		}
		System.out.println("clicked on Login button");
		Thread.sleep(200);
	}

	}		
	

