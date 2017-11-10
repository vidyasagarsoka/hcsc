package bean;

import java.util.List;


public class AppObjectList {
	
	private List<AppObject> applicationList;
	
	public List<AppObject> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<AppObject> applicationList) {
		this.applicationList = applicationList;
	}

	public AppObjectList() {
		super();
	}
	
	
	public class AppObject {
		private String id;
		private String name;
		
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
		
		public AppObject(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}		
	}

}
