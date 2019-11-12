package tps_hr;

import java.util.*;

public abstract class Employee extends TPS {

	protected String id, password;
	protected String name,surname,nickname,tel,address;
	protected int age, salary;
	protected Calendar birthDate, startingDate, resignationDate;
	protected ArrayList<Certificate> certificateList;
	protected ArrayList<Payroll> payrollList;
	protected ArrayList<TimeSheet> timeSheetList;
	protected int workYears; // calculating holiday entitlement
	protected boolean hasResigned;
	protected HolidayEntitlement holiday;
	
	public Employee() {
		setId("");
		setPassword("");
		setPasscode(this.getId(),this.getPassword());
		setName("");
		setSurname("");
		setNickname("");		
		setTel("");
		setAddress("");
		setAge(0);
		setSalary(0);
		certificateList = new ArrayList<Certificate>();
		payrollList = new ArrayList<Payroll>();
		timeSheetList = new ArrayList<TimeSheet>();
		holiday = new HolidayEntitlement(this);
	}
	
	public Employee(String name,String surname) {
		setId("");
		setPassword("");
		setPasscode(this.getId(),this.getPassword());
		setName(name);
		setSurname(surname);
		setNickname("");		
		setTel("");
		setAddress("");
		setAge(0);
		setSalary(0);
		certificateList = new ArrayList<Certificate>();
		payrollList = new ArrayList<Payroll>();
		timeSheetList = new ArrayList<TimeSheet>();
		holiday = new HolidayEntitlement(this);
	}
	
	public void setPasscode(String id,String passcode) {
		this.id  = id;
		this.password = passcode;
		//this.loginData.addLogin(this.getId(), this.getPassword());
	}
	
	public void resign() {
		this.setHasResigned(true);
		this.setResignationDate(Calendar.getInstance());
		this.resignedEmployee.add(this);
	}
	public abstract String toString(); 

	public void calculateWorkYears () {
		Calendar rightnow = Calendar.getInstance();
		rightnow.compareTo(startingDate);
	}
		
	public void promote(int newSalary) {
		this.setSalary(newSalary);
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		Calendar bd = Calendar.getInstance();
		bd.setTime(birthDate);
		this.birthDate = bd;
	}

	public Calendar getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		Calendar rd = Calendar.getInstance();
		rd.setTime(resignationDate);
		this.resignationDate = rd;
	}

	public int getWorkYears() {
		return workYears;
	}

	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}

	public boolean isHasResigned() {
		return hasResigned;
	}

	public void setHasResigned(boolean hasResigned) {
		this.hasResigned = hasResigned;
	}

	public void setResignationDate(Calendar resignationDate) {
		this.resignationDate = resignationDate;
	}

	public Calendar getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		Calendar rd = Calendar.getInstance();
		rd.setTime(startingDate);
		this.startingDate = rd;
	}
	

	
}
