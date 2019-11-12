package tps_hr;

import java.util.ArrayList;

public class Sales extends Employee {
	private double annualCommission;
	private ArrayList<Project> projectHistory;
	
	public Sales(String name, String surname) {
		super(name, surname);
		projectHistory = new ArrayList<Project>();
	}
	
	public void addHistory(Project project) {
		projectHistory.add(project);
	}
	
	public String toString() {
		return "SALES"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+" ("+nickname+")\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}

	//getters&setters
	public double getAnnualCommission() {
		return annualCommission;
	}

	public void setAnnualCommission(double annualCommission) {
		this.annualCommission = annualCommission;
	}

	public ArrayList<Project> getProjectHistory() {
		return projectHistory;
	}
	
	
	
}
