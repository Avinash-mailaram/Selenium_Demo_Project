package flights_libraries;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.AppUtils;

public class Login_Page extends AppUtils
{
	@BeforeTest
	public void login(String uid,String pwd)
	{
		driver.findElement(By.name("email")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
	
	@AfterTest
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
