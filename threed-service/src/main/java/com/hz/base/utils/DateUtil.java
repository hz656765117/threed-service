package com.hz.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DateUtil extends DateUtils {

	public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static long SENCOD_IN_MILLS = 1000L;
	public static long MINUTE_IN_MILLS = SENCOD_IN_MILLS * 60;
	public static long HOUR_IN_MILLS = MINUTE_IN_MILLS * 60;
	public static long DAY_IN_MILLS = HOUR_IN_MILLS * 24;
	
	private static String datePattern = "yyyy-MM-dd";
	
	private static String timePattern = "HH:mm:ss";
	
	private static final String[] parsePatterns = new String[] {  
        "yyyy-MM-dd HH:mm:ss",
        "yyyy-MM-dd HH:mm",
        "yyyy-MM-dd",
        "yyyy-MM",
        "HH:mm",
        "MM/dd/yyyy HH:mm:ss",  
        "MM/dd/yyyy"
        // 这里可以增加更多的日期格式，用得多的放在前面  
    };  
	
	public static String format(Date date, String format) {
		if(date == null) return "";
		
		SimpleDateFormat df = new SimpleDateFormat(StringUtils.defaultIfEmpty(
				format, DEFAULT_FORMAT));
		return df.format(date);
	}
	
	public static String format(Date date) {
		return format(date, DEFAULT_FORMAT);
	}

	public static Date parse(String date) {
		try {
			return parseDate(date, parsePatterns);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	* 判断是否是昨天的某个时间
	 */
	public static boolean isYesterdaySomeTime(Date date) {
    	return isSomeTimeInDay(date, -1);
    }
	
	public static boolean isSomeTimeInDay(Date date, int dayIndex) {
    	if(date == null) return false;
    	
    	Date d2 = addDays(new Date(), dayIndex);
    	return isSameDay(date, d2);
    }
	public static Date format(String date,String pattern) {
		try {
			return parseDate(date, pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取某一天及其前后几天的零点
	 */
	public static Date getZeroTime(Date date, int n){
		return addDays(truncate(date, Calendar.DAY_OF_MONTH), n);
	}
	
	/**
	 *判断两个日期是否是同一天
	 */
	public static boolean isSameDay(Date date1, Date date2) {
		if(date1 == null || date2 == null) return false;
		
		return truncatedEquals(date1, date2, Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 
	 * @param early
	 * @param late
	 * @param type {@link Calendar#HOUR_OF_DAY} etc..
	 * @return
	 */
	public static int timeBetween(Date early, Date late, int type) {
		long v = 1L;
		switch (type) {
		case Calendar.DAY_OF_MONTH:
			v = DAY_IN_MILLS;
			break;
		case Calendar.HOUR:
		case Calendar.HOUR_OF_DAY:
			v = HOUR_IN_MILLS;
			break;
		case Calendar.MINUTE:
			v = MINUTE_IN_MILLS;
			break;
		case Calendar.SECOND:
			v = SENCOD_IN_MILLS;
			break;
		case Calendar.MILLISECOND:
			// default 1
			break;
		default:
			throw new RuntimeException("Unsupported type of:" + type);	
		}
		
		return (int)((late.getTime() - early.getTime()) / v);
	}
	
	public static void main(String[] args) {
		Date d1 = parse("2015-12-20 23:00:00");
		Date d2 = parse("2015-12-20 24:00:01");
		System.out.println(timeBetween(d1, d2, Calendar.SECOND));
	}
	
	/**
	 * 数据库定义 1 SOLAR 阳历; 2 LUNAR 阴历; 增加START 占位enum
	 * @author iacdp
	 *
	 */
	public enum Type {
		START(""), SOLAR("阳历"), LUNAR("阴历");
		
		private String description;

		private Type(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	/**
	 * 判断当前日期是星期几
	 * 
	 * @param pTime
	 *            要判断的时间
	 * @return dayForWeek 判断结果
	 */
	public static String dayForWeek ( Date dateTime ) throws Exception
	{
		Calendar c = Calendar.getInstance ( );
		c.setTime ( dateTime );
		int dayForWeek = 0;
		if ( c.get ( Calendar.DAY_OF_WEEK ) == 1 )
		{
			dayForWeek = 7;
		}
		else
		{
			dayForWeek = c.get ( Calendar.DAY_OF_WEEK ) - 1;
		}
		return String.valueOf(dayForWeek);
	}
	
	/**
     *  获取当前时间的毫秒
     * @return 返回毫秒
     */
    public static long getMillis()
    {	Date date = new Date();
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }
    
    /**
	 * 按照日期格式，将字符串解析为日期对象
	 *
	 * @param aMask
	 *            输入字符串的格式
	 * @param strDate
	 *            一个按aMask格式排列的日期的字符串描述
	 * @return Date 对象
	 * @see java.text.SimpleDateFormat
	 * @throws ParseException
	 */
	public static final Date convertStringToDate(String aMask, String strDate) {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat(aMask);
		/*if (log.isDebugEnabled()) {
			log.debug("converting '" + strDate + "' to date with mask '" + aMask + "'");
		}*/
		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return (date);
	}
	
	/**
	* 得到两个时间相差的分钟数的绝对值，
	* @author zhuzhiyun(祝志云)
	* @version 2016下午4:19:12
	* @param end 时间1
	* @param start 时间2
	* @param ignoreAfterMin 是否忽略分钟后面的秒，毫秒，true：忽略，false：不忽略
	* @return 两个时间相差的分钟数
	* @return long
	 */
	public static int diffDateToMinute(Date end, Date start,boolean ignoreAfterMin) {
		if(ignoreAfterMin){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			try {
				end = sdf.parse(sdf.format(end));
				start = sdf.parse(sdf.format(start));
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//毫秒
		long a = Math.abs((long) ((getMillis(end) - getMillis(start))));
		
		return (int)(a/1000/60);
	}
	
	/**
	 * 返回毫秒
	 *
	 * @param date
	 *            日期
	 * @return 返回毫秒
	 */
	public static long getMillis(java.util.Date date) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(date);
		return c.getTimeInMillis();
	}
	
	/**
	 *获取指定时间的所在月份的月初第一天
	* @author zhuzhiyun(祝志云)
	* @version 2016下午1:09:10
	* @param d 指定的时间
	* @return Date 月初时间
	 */
	public static Date getFirstDayOfMonth(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}
	
	/**
	 *获取指定时间的所在月份的月末最后一天
	* @author zhuzhiyun(祝志云)
	* @version 2016下午1:09:10
	* @param d 指定的时间
	* @return Date 月末最后一天时间
	 */
	public static Date getLastDayOfMonth(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}
	
	/**
	 * 根据日期格式，返回指定日期指定格式转换后的字符串
	 * 
	 * @param date
	 *            日期对象
	 * @param pattern
	 *            指定转换格式
	 * @return 格式化后的日期字符串
	 */
	public static final String getDate(Date date, String pattern) {
		SimpleDateFormat df = null;
		String returnValue = "";
		if (date != null) {
			df = new SimpleDateFormat(pattern);
			returnValue = df.format(date);
		}
		return (returnValue);
	}
	
	public static String getYear() {
		Date date = new Date();
		return getDate(date, "yyyy");
	}

	public static String getMonth() {
		Date date = new Date();
		return getDate(date, "MM");
	}

	public static String getDay() {
		Date date = new Date();
		return getDate(date, "dd");
	}
	/**
	 * 按照日期格式，将字符串解析为日期对象
	 * 
	 * @param strDate
	 *            String
	 * @return Date yyyy-MM-dd
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String strDate) {
		Date aDate = null;
		aDate = convertStringToDate(datePattern, strDate);
		return aDate;
	}
	
	/**
	 * 把传入的日期字符串，转换成指定格式的日期对象
	 * 
	 * @param dateString
	 *            日期字符串
	 * @param pattern
	 *            指定转换格式
	 * @return 日期对象
	 */
	public static Date getDate(String dateString, String pattern) {
		SimpleDateFormat df = null;
		Date date = new Date();
		if (dateString != null) {
			try {
				df = new SimpleDateFormat(pattern);
				date = df.parse(dateString);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	
	/**
	 * 根据日期格式，返回日期按datePattern格式转换后的字符串
	 * 
	 * @param aDate
	 *            Date
	 * @return String
	 */
	public static final String convertDateToString(Date aDate) {
		return getDateTime(datePattern, aDate);
	}
	
	/**
	 * This method generates a string representation of a date's date/time in
	 * the format you specify on input
	 *
	 * @param aMask
	 *            the date pattern the string is in
	 * @param aDate
	 *            a date object
	 * @return a formatted string representation of the date
	 *
	 * @see java.text.SimpleDateFormat
	 */
	public static final String getDateTime(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";
		if (aDate == null) {
			// log.error("aDate is null!");
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}
		return (returnValue);
	}
	
	public static Date convertStringToDate_(String strDate) {
		Date aDate = null;
		aDate = convertStringToDate("yyyy-MM-dd HH:mm:ss", strDate);
		return aDate;
	}
	
	/**
	 * 获取星期几
	 * 
	 * @param date
	 *            date
	 * @return int
	 */
	public static int getDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		return week == 1 ? 7 : week - 1;
	}
	
	/**
	 * 判断是否在一个时间段内
	 * 
	 * @param time
	 * @param begin
	 * @param end
	 * @return
	 */
	public static boolean IsTimeIn(Date time, Date begin, Date end) {
		return time.getTime() >= begin.getTime() && time.getTime() <= end.getTime();
	}
	
	/**
	 * 判断是否在一个时间段内
	 * 
	 * @param time
	 * @param begin
	 * @param end
	 * @return
	 */
	public static boolean IsTimeInNew(Date time, Date begin, Date end) {
		return time.getTime() >= begin.getTime() && time.getTime() < end.getTime();
	}
	
	/**
	 * 根据日期格式，返回日期按datePattern格式转换后的字符串
	 *
	 * @param aDate
	 *            日期对象
	 * @return 格式化后的日期的页面显示字符串
	 */
	public static final String getDate(Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";
		if (aDate != null) {
			df = new SimpleDateFormat(datePattern);
			returnValue = df.format(aDate);
		}
		return (returnValue);
	}
	
	/**
	 * 根据日期格式，返回当前日期指定格式转换后的字符串
	 * 
	 * @param pattern
	 *            指定转换格式
	 * @return 格式化后的日期字符串
	 */
	public static final String getDate(String pattern) {
		Date date = new Date();
		return getDate(date, pattern);
	}
	
	/**
	 * This method returns the current date time in the format: yyyy/MM/dd HH:MM
	 * a
	 *
	 * @param theTime
	 *            the current time
	 * @return the current date/time
	 */
	public static String getTimeNow(Date theTime) {
		return getDateTime(timePattern, theTime);
	}
}
