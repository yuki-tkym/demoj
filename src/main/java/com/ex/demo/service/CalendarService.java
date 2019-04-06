package com.ex.demo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarService {
	public String calcDate(int month, int day) {
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.MONTH, month);
		cal.add(Calendar.DATE, day);

		Date exDate = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat();
		return sdf.format(exDate);
	}
}
