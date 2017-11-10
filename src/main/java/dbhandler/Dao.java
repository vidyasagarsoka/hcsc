package dbhandler;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.AppDetails;
import bean.AppObject;
import bean.AppObjectList;
import bean.Application;

@Repository
class Dao 
{
	Application app=new Application();
	AppDetails ad =new AppDetails();
	AppObjectList aol=new AppObjectList();
	@Autowired
	AppObject ao;
	
    @Autowired
    private SessionFactory sessionFactory;
    
    
 //code for application crud operations
    public void addApplication(Application application) {
        sessionFactory.getCurrentSession().saveOrUpdate(app);
    }
	
    public List<Application> getAllApplications() {
    	 
        return sessionFactory.getCurrentSession().createQuery("from Application") .list();
    }
	  public void deleteApplication(Integer appid) {
        Application application = (Application) sessionFactory.getCurrentSession().load(
                Application.class, appid);
        if (null != application) {
            this.sessionFactory.getCurrentSession().delete(application);
       }
    }
 
    public Application getApplication(int appid) {
        return (Application) sessionFactory.getCurrentSession().get(
                Application.class, appid);
    }
     
    public Application updateApplication(Application application) {
        sessionFactory.getCurrentSession().update(application);
        return application;
    }
 
    

}
