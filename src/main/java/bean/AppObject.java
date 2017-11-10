package bean;

import java.io.Serializable;

//implements Serializable

public class AppObject {
	private String id;
	private String name;
	private String integration;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntegration() {
		return integration;
	}
	public void setIntegration(String integration) {
		this.integration = integration;
	}
	public AppObject(String id, String name,String integration) {
		super();
		this.id = id;
		this.name = name;
		this.integration = integration;
	}
	public AppObject() {
		super();
	}

}
