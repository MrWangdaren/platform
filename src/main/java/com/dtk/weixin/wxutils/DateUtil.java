package com.dtk.weixin.wxutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static final String formatDefaultTimestamp = "yyyy-MM-dd HH:mm:ss.SSS";

	public static final String formatDefaultTime = "yyyy-MM-dd HH:mm:ss";

	public static final String formatDefaultDate = "yyyy-MM-dd";

    public static final String formatDefaultDateMonth = "yyyy-MM";

	public static final String formatDefaultDate2 = "yyyy.MM.dd";

	public static final String formatDefaultHour = "HH:mm:ss";
	
	public static final String formatDefaultDayAndHour = "MM-dd";
	
	private DateUtil() {}

	/**
	 * yyyy-MM-dd HH:mm:ss.SSS
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultTimestamp(Date date) {
		return format(date, new SimpleDateFormat(formatDefaultTimestamp));
	}

	/**
	 * yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultTime(Date date) {
		return format(date, new SimpleDateFormat(formatDefaultTime));
	}

    /**
	 * yyyy-MM-dd HH:mm:ss
	 *
	 * @param date
	 * @return
	 */
	public static String defaultDateMonth(Date date) {
		return format(date, new SimpleDateFormat(formatDefaultDateMonth));
	}

	/**
	 * yyyy-MM-dd HH:mm:ss
	 * 
	 * @param time
	 *            ,精确到 ms
	 * @return
	 */
	public static String defaultTime(long time) {
		return format(new Date(time), new SimpleDateFormat(formatDefaultTime));
	}

	/**
	 * yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultDate(Date date) {
		return format(date, new SimpleDateFormat(formatDefaultDate));
	}
	
	/**
	 * yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultDate(long time) {
		return format(new Date(time), new SimpleDateFormat(formatDefaultDate));
	}

	/**
	 * yyyy.MM.dd
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultDate2(long time) {
		return format(new Date(time), new SimpleDateFormat(formatDefaultDate2));
	}

	/**
	 * HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String defaultThour(Date date) {
		return format(date, new SimpleDateFormat(formatDefaultHour));
	}

	public static String format(Date aDate, SimpleDateFormat aFormat) {
		if (aDate == null || aFormat == null) {
			return "";
		}
		synchronized (aFormat) {
			return aFormat.format(aDate);
		}
	}

	public static Date parse(String ds, SimpleDateFormat aFormat) {
		if (ds == null || aFormat == null) {
			return null;
		}
		synchronized (aFormat) {
			try {
				return aFormat.parse(ds);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

	public static Date parse(String ds) {
		SimpleDateFormat format = new SimpleDateFormat(formatDefaultDate);
		return parse(ds, format);
	}

	/**
	 * 当前时间
	 * 
	 * @return
	 */
	public static Date now() {
		return new Date();
	}

	/**
	 * 当前时间的unix时间戳，精确到s
	 * 
	 * @return
	 */
	public static long nowTime() {
		return System.currentTimeMillis() / 1000;
	}

}
