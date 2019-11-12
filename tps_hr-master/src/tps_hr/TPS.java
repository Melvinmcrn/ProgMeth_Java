package tps_hr;

import java.util.Map;
import java.util.Date;
import java.util.ArrayList;

public class TPS {
	protected ArrayList<CEO> ceoList;
	protected ArrayList<EVP> evpList;
	protected ArrayList<Operation> operationList;
	protected ArrayList<Sales> salesList;
	protected ArrayList<GA> gaList;
	protected ArrayList<Finance> financeList;
	protected ArrayList<Project> projectList;
	protected ArrayList<Employee> resignedEmployee;
	protected ArrayList<Notification> notification;
	protected Map<String,String> loginInfo;
	public int latestProjectCode;
	
	private String[] type = {"Engineer","CEO","Engineer","Sales","GA","EVP","Sales","Finance"};
	private String[] nameL = {"Massimiliano","Romnalin","Shin","Lalida","Sutiwat","Pichaya","Methawee","Chalisa"};
	private String[] surnameL = {"Cristina na nan","Kitkasetsathaporn","Sripadungtham","Waura-angkura","Simtharakao","Karawawattana","Boonchana","Vaichiaranai"};
	private String[] nicknameL = {"Mass","Mill","Shin","Mywl","Mo","Pam","May","Amy"};
	private String[] telL = {"090-052-7325","082-497-1999","095-579-7596","088-002-4894","061-651-4199","084-300-3893","082-470-4115","095-478-1745"};
	private String[] addressL = {"Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering"};
	private int[] ageL = {20,19,19,19,20,19,19,19}; 
	private int[] salaryL = {25000,100000,35000,30000,20000,80000,30000,24000};
	private int[] bdayL = {17,12,16,24,31,19,6,8};
	private int[] bmonthL = {10,10,3,2,7,3,4,4};
	private int[] byearL = {98,99,99,99,98,99,99,99}; 
	private int[] sdayL = {1,2,3,4,5,6,7,8};
	private int[] smonthL = {6,3,3,4,5,6,9,10};
	private int[] syearL = {105,105,105,105,105,105,105,105};
	private String[] idL = {"00024","00120","00110","00341","02343","12345","98788","87778"};
	private String[] passwordL = {"12345","12121","11111","22222","33333","44444","55555","66666"};
	
			
	
	private int initialsize = 8;
	
	public TPS() {
		operationList = new ArrayList<Operation>();
		ceoList = new ArrayList<CEO>();
		evpList = new ArrayList<EVP>();
		salesList = new ArrayList<Sales>();
		gaList = new ArrayList<GA>();
		financeList = new ArrayList<Finance>();
		projectList = new ArrayList<Project>();
		resignedEmployee = new ArrayList<Employee>();
		notification = new ArrayList<Notification>();
		this.setLatestProjectCode(0);	
		//loginData = new login();
		
		for(int i=0;i<initialsize;i++) {
			//CEO
			if(type[i] == "CEO") {
				CEO ceo = new CEO(nameL[i],surnameL[i]);
				ceo.setNickname(nicknameL[i]);
				ceo.setTel(telL[i]);
				ceo.setAddress(addressL[i]);
				ceo.setAge(ageL[i]);
				ceo.setSalary(salaryL[i]);
				ceo.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				ceo.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				ceo.setPasscode(idL[i], passwordL[i]);
				ceoList.add(ceo);
			}
			//Operation
			if(type[i] == "Engineer") {
				Operation eng = new Operation(nameL[i],surnameL[i]);
				eng.setNickname(nicknameL[i]);
				eng.setTel(telL[i]);
				eng.setAddress(addressL[i]);
				eng.setAge(ageL[i]);
				eng.setSalary(salaryL[i]);
				eng.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				eng.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				eng.setPasscode(idL[i], passwordL[i]);
				operationList.add(eng);
			}
			//EVP
			if(type[i] == "EVP") {
				EVP evp = new EVP(nameL[i],surnameL[i]);
				evp.setNickname(nicknameL[i]);
				evp.setTel(telL[i]);
				evp.setAddress(addressL[i]);
				evp.setAge(ageL[i]);
				evp.setSalary(salaryL[i]);
				evp.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				evp.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				evp.setPasscode(idL[i], passwordL[i]);
				evpList.add(evp);
			}
			//GA
			if(type[i] == "GA") {
				GA ga = new GA(nameL[i],surnameL[i]);
				ga.setNickname(nicknameL[i]);
				ga.setTel(telL[i]);
				ga.setAddress(addressL[i]);
				ga.setAge(ageL[i]);
				ga.setSalary(salaryL[i]);
				ga.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				ga.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				ga.setPasscode(idL[i], passwordL[i]);
				gaList.add(ga);
			}
			//Finance
			if(type[i] == "Finance") {
				Finance fn = new Finance(nameL[i],surnameL[i]);
				fn.setNickname(nicknameL[i]);
				fn.setTel(telL[i]);
				fn.setAddress(addressL[i]);
				fn.setAge(ageL[i]);
				fn.setSalary(salaryL[i]);
				fn.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				fn.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				//fn.setPasscode(idL[i], passwordL[i]);
				financeList.add(fn);
			}
			if(type[i] == "Sales") {
				Sales sale = new Sales(nameL[i],surnameL[i]);
				sale.setNickname(nicknameL[i]);
				sale.setTel(telL[i]);
				sale.setAddress(addressL[i]);
				sale.setAge(ageL[i]);
				sale.setSalary(salaryL[i]);
				sale.setBirthDate(new Date(byearL[i],bmonthL[i],bdayL[i]));
				sale.setStartingDate(new Date(syearL[i],smonthL[i],sdayL[i]));
				sale.setPasscode(idL[i], passwordL[i]);
				salesList.add(sale);
			}	
		}
	}

	public Project projectCodeToProject(int projectCode) {
		if (projectCode > (this.getLatestProjectCode()-1)) {
			projectCode = this.getLatestProjectCode()-1;
		}
		for(int i=0;i<projectList.size();i++) {
			if(projectList.get(i).getProjectCode() == projectCode) {
				return projectList.get(i);
			}
		}
		return projectList.get(projectList.size()-1);
	}
	
	public void addCEO(CEO ceo) {
		this.ceoList.add(ceo);
	}
	
	public void addEVP(EVP evp) {
		this.evpList.add(evp);
	}
	
	public void addOperation(Operation operation) {
		this.operationList.add(operation);
	}
	
	public void addSales(Sales sales) {
		this.salesList.add(sales);
	}
	
	public void addGA(GA ga) {
		this.gaList.add(ga);
	}
	
	public void addFinance(Finance finance) {
		this.financeList.add(finance);
	}
	
	public void addProject(Project projectName) {
		this.projectList.add(projectName);
		this.setLatestProjectCode(this.latestProjectCode +1);
	}

	//getter&setter for project code
	public int getLatestProjectCode() {
		return latestProjectCode;
	}

	public void setLatestProjectCode(int latestProjectCode) {
		this.latestProjectCode = latestProjectCode;
	}

	public Map<String, String> getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(Map<String, String> loginInfo) {
		this.loginInfo = loginInfo;
	}

	public ArrayList<CEO> getCeoList() {
		return ceoList;
	}

	public void setCeoList(ArrayList<CEO> ceoList) {
		this.ceoList = ceoList;
	}

	public ArrayList<EVP> getEvpList() {
		return evpList;
	}

	public void setEvpList(ArrayList<EVP> evpList) {
		this.evpList = evpList;
	}

	public ArrayList<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(ArrayList<Operation> operationList) {
		this.operationList = operationList;
	}

	public ArrayList<Sales> getSalesList() {
		return salesList;
	}

	public void setSalesList(ArrayList<Sales> salesList) {
		this.salesList = salesList;
	}

	public ArrayList<GA> getGaList() {
		return gaList;
	}

	public void setGaList(ArrayList<GA> gaList) {
		this.gaList = gaList;
	}

	public ArrayList<Finance> getFinanceList() {
		return financeList;
	}

	public void setFinanceList(ArrayList<Finance> financeList) {
		this.financeList = financeList;
	}
	
	
}
