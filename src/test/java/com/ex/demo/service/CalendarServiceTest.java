package com.ex.demo.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class CalendarServiceTest {
	@Test
	public void testCalcDate() {
		CalendarService cs = new CalendarService();
		Date nowDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		assertEquals(sdf.format(nowDate),cs.calcDate());
	}

}
