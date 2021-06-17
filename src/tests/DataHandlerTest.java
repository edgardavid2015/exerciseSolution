package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import handler.dataHandler;

public class DataHandlerTest {
	
	@Test
	public void testSplitName() {
		String expected = "EDGAR";
		String result = dataHandler.splitName("EDGAR=MO10:00-12:00");
		assertEquals(expected, result);
	}

	@Test
	public void testSplitWork() {
		String expected = "MO10:00-12:00";
		String result = dataHandler.splitWork("EDGAR=MO10:00-12:00");
		assertEquals(expected, result);
	}

	@Test
	public void testWeekWorked() {
		String[] expected = {"SA00:00-12:00","SU08:00-20:00"};
		String[] result = dataHandler.weekWorked("SA08:00-12:00,SU08:00-20:00");
		assertArrayEquals(expected, result);
	}

	@Test
	public void testGetAcronymdayWorked() {
		String expected = "SU";
		String result = dataHandler.getAcronymdayWorked("SU08:00-20:00");
		assertEquals(expected, result);
	}

	@Test
	public void testGetRangeWorked() {
		String expected = "18:00-23:00";
		String result = dataHandler.getRangeWorked("MO19:00-23:00");
		assertEquals(expected, result);
	}

}
