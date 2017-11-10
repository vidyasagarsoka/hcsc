package bean;

public class DependentApps {

	public String appid;
	public String appname;
	public String integration;
	
	
	
	public String getAppid() {
		return appid;
	}



	public void setAppid(String appid) {
		this.appid = appid;
	}



	public String getAppname() {
		return appname;
	}



	public void setAppname(String appname) {
		this.appname = appname;
	}



	public String getIntegration() {
		return integration;
	}



	public void setIntegration(String integration) {
		this.integration = integration;
	}



	public DependentApps(String appid, String appname, String integration) {
		super();
		this.appid = appid;
		this.appname = appname;
		this.integration = integration;
	}



	public DependentApps() {
		super();
	}
	
	
	

		

	
	
	
	
}
