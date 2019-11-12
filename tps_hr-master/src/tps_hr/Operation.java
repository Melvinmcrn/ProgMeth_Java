package tps_hr;

import java.util.ArrayList;
import java.util.Calendar;

public class Operation extends Employee {
	private int annualTravelExpense;
	private ArrayList<Project> projectHistory;
	
	public Operation(String name,String surname) {
		super(name,surname);
		projectHistory = new ArrayList<Project>();
	}
	
	public void addHistory(Project project) {
		projectHistory.add(project);
	}
	
	public void implementProject(Project project,int travelexpense) {
		Calendar rightnow = Calendar.getInstance();
		project.setImplemented(true);
		project.setImplementDate(rightnow);
		project.setTravelExpenses(travelexpense);
	}
	
	//getter & setter
	public int getAnnualTravelExpense() {
		return annualTravelExpense;
	}

	public void setAnnualTravelExpense(int annualTravelExpense) {
		this.annualTravelExpense = annualTravelExpense;
	}

	@Override
	public String toString() {
		return "OPERATION"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+" ("+nickname+")\n"+
	           "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
	
	
}
