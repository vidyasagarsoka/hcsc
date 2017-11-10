package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonStreamContext;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.JsonParser.NumberType;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONString;
import org.json.simple.parser.JSONParser;

import bean.AppDetails;
import bean.AppObject;

//import com.sun.xml.internal.ws.api.message.Message;

import bean.AppObjectList;
import bean.Application;
import bean.DependentApplication;
import bean.Details;
import service.NewService;

@Path("/apps")
public class AppDetailsController {
	
	
	NewService appdetailservice =  new NewService();
	
	 @GET
	 @Path("/fetchAllAppDetails")
	    @Produces(MediaType.APPLICATION_JSON)
		public List<Details> getAppDetails()
		{
			System.out.println("inside member getAppDetails");
			List<Details> listOfApps=appdetailservice.getAllApps();
			
			System.out.println("id :"+listOfApps.get(0).getAppId()+"dep id    "+listOfApps.get(0).getDependentId());
			
			return listOfApps;
		}
	 
	
	@GET
	 @Path("/fetchAppByID/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
		public List<Details> getAppByID(@PathParam("id") String appId)
		{
	
			System.out.println("inside member getAppByID");
			List<Details> listOfApps=appdetailservice.getAppforID(appId);
			/*Details d=new Details();*/
			 System.out.println("from one id");
		
			return listOfApps;
			
		}
	
	
		 @POST
		 @Path("/insertApp")
		 @Consumes(MediaType.APPLICATION_JSON)
					public String saveAppDetails(Application app) throws SQLException, JSONException
					{
						System.out.println("inside consumes");
										
						System.out.println(" msg   :"+app.getAppid());
						System.out.println(" msg   :"+app.getAppname());
						System.out.println(" msg   :"+app.getUpstream());
						System.out.println(" msg   :"+app.getDownstream());
					int result =appdetailservice.saveApp(app);
						    					return "saved!";
					} 
		 
		
		@DELETE
	       @Path("/deleteAppByID/{id}")
		 @Consumes(MediaType.APPLICATION_JSON)
	          
	              public String deleteAppByID(@PathParam("id") String appid) throws SQLException
	              {
	              // @Path("/fetchAppByID/{id}") @PathParam("id") String appid
	       //     System.out.println("fetched id from url :"+appid);
	                     System.out.println("inside member deleteAppByID");
	                     NewService appdetailservice =  new NewService();
	                     appdetailservice.deleteApp(appid);
	                    
	                    
	                     return "deleted";
	                    
	              }
					
					
}
