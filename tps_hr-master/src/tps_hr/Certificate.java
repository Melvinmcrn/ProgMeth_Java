package tps_hr;

public class Certificate {
	private int year;
	private String certificateName;
	private String organization;
	
	public Certificate(){
		setYear(0);
		setCertificateName("");
		setOrganization("");
	}
	
	public Certificate(int year,String name,String organization) {
		setYear(year);
		setCertificateName(name);
		setOrganization(organization);
		
	}
	
	//getter and setter
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
}
