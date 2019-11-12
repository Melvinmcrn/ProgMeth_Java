package tps_hr;

public class Payroll {
	private int month;
	private int year;
	private int salary;
	private int commission;
	
	public Payroll(int month,int year,int salary,int commission) {
		setMonth(month);
		setYear(year);
		setSalary(salary);
		setCommission(commission);
	}
	public int calculatePayroll() {
		return this.getSalary()+this.getCommission();
	}
	//getter and setter
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month>12) {
			this.month = 0 ;
		}else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<0 || salary==0) this.salary = 0;
		else this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
}
