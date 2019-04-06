package com.ex.demo.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class CalendarServiceTest {
	@Test
	public void testCalcDate() {
		CalendarService cs = new CalendarService();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		SimpleDateFormat sdf = new SimpleDateFormat();
		assertEquals(sdf.format(cal.getTime()),cs.calcDate());
	}

}
