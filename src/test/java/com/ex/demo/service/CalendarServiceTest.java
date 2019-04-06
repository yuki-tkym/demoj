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
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		// テスト成功パターン
		assertEquals(sdf.format(new Date()),cs.calcDate());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		//　テスト失敗パターン
//		assertEquals(sdf.format(cal.getTime()),cs.calcDate());
	}

}
