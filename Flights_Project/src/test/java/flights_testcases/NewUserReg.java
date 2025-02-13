package flights_testcases;

import org.testng.annotations.Test;

import flights_libraries.User_Reg;

public class NewUserReg extends User_Reg{
	
	@Test
	public void cretateUser() {
	
	User_Reg user= new User_Reg();
	user.NewUserRegistration();

}}
