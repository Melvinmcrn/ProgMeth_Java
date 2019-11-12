package tps_hr;

public class CEO extends Employee implements Approvable {
	public CEO() {
		super();
	}
	public CEO(String name, String surname) {
		super(name, surname);
	}
	
	public void approveProject(int projectCode) {
		Project a = projectCodeToProject(projectCode);
		a.setApprovedbyCEO(true);
	}
	
	public String printAllMembers() {
		String data = "";
		
		data += "CEO: \n";
		for (int i=0; i<ceoList.size(); i++) {
			data += "ID: "+ceoList.get(i).getId()+"\nName: "+ceoList.get(i).getName()+" Surname: "
					+ceoList.get(i).getSurname()+"\nSalary: "+ceoList.get(i).getSalary()+"\n\n";
			}
		data += "EVP: \n";
		for (int i=0; i<evpList.size(); i++) {
			data += "ID: "+evpList.get(i).getId()+"\nName: "+evpList.get(i).getName()+" Surname: "
					+evpList.get(i).getSurname()+"\nSalary: "+evpList.get(i).getSalary()+"\n\n";
			}
		data += "OPERATION: \n";
		for (int i=0; i<operationList.size(); i++) {
			data += "ID: "+operationList.get(i).getId()+"\nName: "+operationList.get(i).getName()+" Surname: "
					+operationList.get(i).getSurname()+"\nSalary: "+operationList.get(i).getSalary()+"\n\n";
			}
		data += "SALES: \n";
		for (int i=0; i<salesList.size(); i++) {
			data += "ID: "+salesList.get(i).getId()+"\nName: "+salesList.get(i).getName()+" Surname: "
					+salesList.get(i).getSurname()+"\nSalary: "+salesList.get(i).getSalary()+"\n\n";
			}
		data += "GA: \n";
		for (int i=0; i<gaList.size(); i++) {
			data += "ID: "+gaList.get(i).getId()+"\nName: "+gaList.get(i).getName()+" Surname: "
					+gaList.get(i).getSurname()+"\nSalary: "+gaList.get(i).getSalary()+"\n\n";
			}
		data += "FINANCE: \n";
		for (int i=0; i<financeList.size(); i++) {
			data += "ID: "+financeList.get(i).getId()+"\nName: "+financeList.get(i).getName()+" Surname: "
					+financeList.get(i).getSurname()+"\nSalary: "+financeList.get(i).getSalary()+"\n\n";
			}
		return data;
	}
	
	public String toString() {
		return "CEO"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
