package tps_hr;

public class EVP extends Employee implements Approvable {
	
	public EVP() {
		super();
	}
	public EVP(String name, String surname) {
		super(name, surname);
	}
	public void approveProject(int projectCode) {
		Project a = projectCodeToProject(projectCode);
		a.setApprovedbyEVP(true);
	}
	
	public String printOperationMembers() {
		String data = "";
		for (int i=0; i<operationList.size(); i++) {
			data += "ID: "+operationList.get(i).getId()+"\nName: "+operationList.get(i).getName()+" Surname: "
					+operationList.get(i).getSurname()+"\nSalary: "+operationList.get(i).getSalary()+"\n\n";
			}
		return data;
	}
	
	public String toString() {
		return "EVP"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}

}
