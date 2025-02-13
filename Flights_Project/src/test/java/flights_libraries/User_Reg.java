package flights_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class User_Reg extends AppUtils{
	
	public void NewUserRegistration(){
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("Rakesh");
		driver.findElement(By.name("contact")).sendKeys("1234567890");
		driver.findElement(By.id("email")).sendKeys("rakeshk@gmail.com");
		driver.findElement(By.id("address")).sendKeys("Rakesh@123");
		Select Gender= new Select( driver.findElement(By.name("gender")));
	
		Gender.selectByValue("M");
	driver.findElement(By.name("dob")).sendKeys("25-09-1992");
	driver.findElement(By.name("submit")).click();
}
}
