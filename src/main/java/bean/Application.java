package bean;

import java.io.Serializable;

public class Application implements Serializable{
	private String appid;
	private String appname;
	private String upstream;
	private String downstream;

	
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

	public String getUpstream() {
		return upstream;
	}
	public void setUpstream(String upstream) {
		this.upstream = upstream;
	}
	public String getDownstream() {
		return downstream;
	}
	public void setDownstream(String downstream) {
		this.downstream = downstream;
	}
	public Application() {
		super();
	}
	public Application(String appid, String appname, String upstream, String downstream) {
		super();
		this.appid = appid;
		this.appname = appname;
		this.upstream = upstream;
		this.downstream = downstream;
	}
}
