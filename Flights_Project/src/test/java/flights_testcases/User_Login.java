package flights_testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flights_libraries.Login_Page;

public class User_Login extends Login_Page{
	
	
	public void checkUserLogin() {
		
		Login_Page lp= new Login_Page();
		lp.login("rakeshk@gmail.com", "Rakesh@123");
		
		lp.logout();
	}

}
