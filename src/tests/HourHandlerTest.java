package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import handler.hourHandler;

public class HourHandlerTest {

	@Test
	public void testGetStartHour() {
		String expected = "08:00";
		String result = hourHandler.getStartHour("08:00-00");
		assertEquals(expected, result);
	}

	@Test
	public void testGetFinishHour() {
		String expected = "19:00";
		String result = hourHandler.getFinishHour("00-20:00");
		assertEquals(expected, result);
	}

	@Test
	public void testConvertToMinutes() {
		int expected = 600;
		int result = hourHandler.convertToMinutes("10:00");
		assertEquals(expected, result);
	}

	@Test
	public void testGetPriceWeekday() {
		int expected = 500;
		int result = hourHandler.getPriceWeekday("05:00", "09:00");
		System.out.println(result);
		assertEquals(expected, result);
	}

	@Test
	public void testGetPriceWeekend() {
		int expected = 40;
		int result = hourHandler.getPriceWeekend("12:00", "14:00");
		assertEquals(expected, result);
	}

}
