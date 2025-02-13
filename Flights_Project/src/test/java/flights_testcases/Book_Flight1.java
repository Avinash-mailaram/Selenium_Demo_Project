package flights_testcases;

import org.testng.annotations.Test;

import flights_libraries.Booking_Flight;
import flights_libraries.Login_Page;

public class Book_Flight1 extends Booking_Flight{

	@Test
	public void user_able_to_book_flight() throws Throwable {
		
		Login_Page lp= new Login_Page();
		lp.login("rakeshk@gmail.com", "Rakesh@123");
		Booking_Flight f1= new Booking_Flight();
		f1.flightBooking();
		
		Thread.sleep(2000);
		
		
	}
}
