package bean;

public class DependentApplication {

	private int serilno;
	private String appid;
	private String dependentid;
	private String upordown;
	public int getSerilno() {
		return serilno;
	}
	public void setSerilno(int serilno) {
		this.serilno = serilno;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getDependentid() {
		return dependentid;
	}
	public void setDependentid(String dependentid) {
		this.dependentid = dependentid;
	}
	public String getUpordown() {
		return upordown;
	}
	public void setUpordown(String upordown) {
		this.upordown = upordown;
	}
	public DependentApplication(int serilno, String appid, String dependentid, String upordown) {
		super();
		this.serilno = serilno;
		this.appid = appid;
		this.dependentid = dependentid;
		this.upordown = upordown;
	}
	public DependentApplication() {
		super();
	}
	

}
