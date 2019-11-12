package tps_hr;

import java.util.Map;

public class login {
	
	private Map<String,String> loginInfo;
	private String[] idL = {"00024","00120","00110","00341","02343","12345","98788","87778"};
	private String[] passwordL = {"12345","12121","11111","22222","33333","44444","55555","66666"};
	private int initialsize = 8;
	
	public login() {
		for(int i = 0 ; i<initialsize ;i++) {
			this.loginInfo.replace(idL[i], passwordL[i]);
		}
	}
	
	public void addLogin(String id,String pass) {
		this.loginInfo.replace(id, pass);
	}
	public void editLogin(String id,String pass) {
		this.loginInfo.replace(id, pass);
	}
	public void removeLogin(String id) {
		this.loginInfo.remove(id);
	}
	
	//getters & setters
	public Map<String, String> getLoginInfo() {
		return loginInfo;
	}
	
	public void setLoginInfo(Map<String, String> loginInfo) {
		this.loginInfo = loginInfo;
	}
	
	
}
