package flights_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class Booking_Flight extends AppUtils
{
	
	public void flightBooking() throws Throwable {
		driver.findElement(By.id("search-date")).sendKeys("02/12/2024");
		
		Select fly_from= new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/select")));
				fly_from.selectByVisibleText("Hyderabad");
			
			Select fly_to= new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[3]/select")));
			fly_to.selectByVisibleText("Kolkatha");
			driver.findElement(By.xpath("//div/div[2]/div[1]/div/div/div[4]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/table/tbody/tr[5]/td[9]/button")).click();
			driver.findElement(By.id("name")).sendKeys("Mohan");
			driver.findElement(By.xpath("//input[@type='radio' and @value='First Class']")).click();
			driver.findElement(By.xpath("//div[2]/div[1]/div/div/form/div/div[4]/div/button")).click(); 
	}

}
