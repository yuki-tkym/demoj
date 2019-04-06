package com.ex.demo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarService {
	public String calcDate() {
		Calendar cal = Calendar.getInstance();
		Date exDate = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat();
		return sdf.format(exDate);
	}
}
