package tps_hr;

public class Finance extends Employee {
	public Finance() {
		super();
	}
	public Finance(String name, String surname) {
		super(name, surname);
	}
	
	public String printAllPayroll(int month, int year) {
		String data = "";
		
		String monthPostfix;
		if (month == 1) monthPostfix = "st";
		else if (month == 2) monthPostfix = "nd";
		else if (month == 3) monthPostfix = "rd";
		else monthPostfix = "th";
		
		data += "CEO: \n";
		for (int i=0; i<ceoList.size(); i++) {
			data += "ID: "+ceoList.get(i).getId()+"\nName: "+ceoList.get(i).getName()+" Surname: "
					+ceoList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
			for (int ii=0; ii<ceoList.get(i).payrollList.size(); ii++) {
				if (ceoList.get(i).payrollList.get(ii).getMonth() == month && ceoList.get(i).payrollList.get(ii).getYear() == year) {
					data += ceoList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		data += "EVP: \n";
		for (int i=0; i<evpList.size(); i++) {
			data += "ID: "+evpList.get(i).getId()+"\nName: "+evpList.get(i).getName()+" Surname: "
					+evpList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
			for (int ii=0; ii<evpList.get(i).payrollList.size(); ii++) {
				if (evpList.get(i).payrollList.get(ii).getMonth() == month && evpList.get(i).payrollList.get(ii).getYear() == year) {
					data += evpList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		data += "OPERATION: \n";
		for (int i=0; i<operationList.size(); i++) {
			data += "ID: "+operationList.get(i).getId()+"\nName: "+operationList.get(i).getName()+" Surname: "
					+operationList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<operationList.get(i).payrollList.size(); ii++) {
				if (operationList.get(i).payrollList.get(ii).getMonth() == month && operationList.get(i).payrollList.get(ii).getYear() == year) {
					data += operationList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		
		data += "SALES: \n";
		for (int i=0; i<salesList.size(); i++) {
			data += "ID: "+salesList.get(i).getId()+"\nName: "+salesList.get(i).getName()+" Surname: "
					+salesList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<salesList.get(i).payrollList.size(); ii++) {
				if (salesList.get(i).payrollList.get(ii).getMonth() == month && salesList.get(i).payrollList.get(ii).getYear() == year) {
					data += salesList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		
		data += "GA: \n";
		for (int i=0; i<gaList.size(); i++) {
			data += "ID: "+gaList.get(i).getId()+"\nName: "+gaList.get(i).getName()+" Surname: "
					+gaList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<gaList.get(i).payrollList.size(); ii++) {
				if (gaList.get(i).payrollList.get(ii).getMonth() == month && gaList.get(i).payrollList.get(ii).getYear() == year) {
					data += gaList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		
		data += "FINANCE: \n";
		for (int i=0; i<financeList.size(); i++) {
			data += "ID: "+financeList.get(i).getId()+"\nName: "+financeList.get(i).getName()+" Surname: "
					+financeList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<financeList.get(i).payrollList.size(); ii++) {
				if (financeList.get(i).payrollList.get(ii).getMonth() == month && financeList.get(i).payrollList.get(ii).getYear() == year) {
					data += financeList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		
		return data;
	}
	
	public String toString() {
		return "FINANCE"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
