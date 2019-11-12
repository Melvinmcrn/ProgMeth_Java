package tps_hr;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class HolidayEntitlement {
	private int maxHolidays , usedHolidays;
	
	public HolidayEntitlement(Employee e) {
		if(e.getWorkYears() >= 1 && e.getWorkYears() < 3) {
			this.setMaxHolidays(3);
		}
		if(e.getWorkYears() >=3 && e.getWorkYears()<5) {
			this.setMaxHolidays(6);
		}
		if(e.getWorkYears()>5) {
			this.setMaxHolidays(8);
		}
	}
	public int calculateHolidayEntitlement(int maxHolidays, int usedHolidays) {
		return maxHolidays-usedHolidays;
	}	
	public long decreaseHolidays(Date date1, Date date2) {
		long diff = date2.getTime() - date1.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}//absent for more than 1 day
	public void reset() {
		this.setUsedHolidays(0);
	}
	public int getmaxHolidays() {
		return this.maxHolidays;
	}
	public void setMaxHolidays(int max) {
		this.maxHolidays = max;
	}
	public int getUsedHolidays() {
		return usedHolidays;
	}

	public void setUsedHolidays(int usedHolidays) {
		this.usedHolidays = usedHolidays;
	}
}
