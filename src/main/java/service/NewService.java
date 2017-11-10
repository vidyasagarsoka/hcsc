package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import bean.Application;
import bean.ConvertStream;
import bean.Details;
import bean.Table1;
import bean.Table2;
import dbhandler.DbHandler;

public class NewService {
	
	
	 
	 
		   public List<Details>getAllApps() 
	   {
			  
	
		DbHandler db = DbHandler.getInstance();
		Connection conn = db.ObtainConnection();
		
		List<Details> details = new ArrayList<Details>();

		ResultSet rs;
		String queryString1 = " select t1.appId, t1.appName,"
				+ " case when t1.appId=t2.parentId then t2.childId "
				+ "when t1.appId=t2.childId then t2.parentId when  "
				+ "t2.parentId is null then 'N/A' when t2.childId  is null then 'N/A' end as dependantId,"
				+ " case when t1.appId=t2.parentId then 'down' when t1.appId=t2.childId"
				+ " then 'up' when  t2.parentId is null then 'N/A' when t2.childId "
				+ " is null then 'N/A' end streams, case when  t2.parentId is null then 'N/A' "
				+ "when t2.childId  is null then 'N/A' else t2.integrated end from app_details "
				+ "t1 left join stream t2 on t1.appId=t2.ParentId or t1.appId=t2.childId order by t1.appId";
		/*
		  usig hibernate
		  
		  
		  */
		
		
		
		
				
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(queryString1);
			
			while (rs.next()) {
			
				 Details d=new Details();
				 
			
				 
				   
				 d.setAppId(rs.getString(1));
				 d.setAppName(rs.getString(2));
				 d.setDependentId(rs.getString(3));
				 d.setStreams(rs.getString(4));
				 d.setIntegrated(rs.getString(5));
				 
				
					System.out.println("appid from table: "+rs.getString(1));
					details.add(d);
				
				 
				 
				
			}

		} catch (SQLException sqle) {
		}
		db.CloseConnection();
		return details;
	  }
		   
		   
		   public  List<Details> getAppforID(String appId) 
		   {
			System.out.println(" inside getAppforID");
			System.out.println("      apid:"+appId);
			
			
			DbHandler db = DbHandler.getInstance();
			Connection conn = db.ObtainConnection();
			List<Details> details1 = new LinkedList<Details>();
			 
			ResultSet rs;
			String queryString1 = "select t1.appId, t1.appName, case when t1.appId=t2.parentId then t2.childId when t1.appId=t2.childId then t2.parentId when  t2.parentId is null then 'N/A' when t2.childId  is null then 'N/A' end  as dependantId, case when t1.appId=t2.parentId then 'down' when t1.appId=t2.childId then 'up' when  t2.parentId is null then 'N/A' when t2.childId  is null then 'N/A' end streams, case when  t2.parentId is null then 'N/A' when t2.childId  is null then 'N/A' else t2.integrated end from app_details t1 left join stream t2 on t1.appId=t2.ParentId or t1.appId=t2.childId where t1.appId='"+appId+"' order by t1.appId ";
			
			try {
				
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery(queryString1);
				int count = 0;
				while (rs.next()) {
					Details d=new Details();
					d.setAppId(rs.getString(1));
					System.out.println("out : "+rs.getString(2));
					d.setAppName(rs.getString(2));
					d.setDependentId(rs.getString(3));
					System.out.println("dout : "+rs.getString(3));
					 d.setStreams(rs.getString(4));
					 d.setIntegrated(rs.getString(5));
						
							details1.add(d); 
					}

			} catch (SQLException sqle) {
			}
			db.CloseConnection();
			
			return details1;
		  }
	   
		   public int saveApp(Application a) throws SQLException
	       {
			   int flag=0;
			   int flag1=0;
			   int flag2=0;
			   ResultSet result1;
			   ResultSet result2;
			   ResultSet result;
			   int rs1 = 0;
			   int rs2 = 0;
			
	          
	                       System.out.println("inside AppDetailsService-->saveAllApps");
	                
	                  ConvertStream conv=new ConvertStream();
	                  String[] upp=conv.convert(a.getUpstream());
	                  String[] down=conv.convertdown(a.getDownstream());
	                  
	                  List<Table1> table1=new ArrayList<Table1>();
	                  

	               
	                   
	                  DbHandler db = DbHandler.getInstance();
	                  
	                    Connection conn = db.ObtainConnection();
	                   
	                    
	                    Statement stmt = conn.createStatement();
	    				result = stmt.executeQuery("select appId from app_details");

	    				while (result.next()) {
	    				

   						 System.out.println("checking DB------"+result.getString(1));
	    					 if(a.getAppid().equals(result.getString(1)))
		            		  {
		            	  flag=1;
		            	  break;
		            		  }
	    	
	    				}
	             
	              
	              Table1 tab1=new Table1();
                  
	              if(flag!=1)
                  {
                	  tab1.setId(a.getAppid());
	                  tab1.setName(a.getAppname());
                	  table1.add(tab1);
                	  PreparedStatement prepStmt1 = (PreparedStatement) conn.prepareStatement(   
        	                    "INSERT INTO app_details (`appId`, `appName`) VALUES (?,?)");
                   prepStmt1.setString(1,a.getAppid());
                   prepStmt1.setString(2,a.getAppname());
                    rs1 = prepStmt1.executeUpdate();
                	 
                  }
	              
	           
  				

				while (result.next()) {
				
					 if(upp[0].equals(result.getString(1)))
		       		  {
		       	  flag1=1;
		       	  break;
		       		  }
				}
  				
  				 
  				if(flag1!=1)
                {
              	  tab1.setId(upp[0]);
	                  tab1.setName(upp[1]);
              	  table1.add(tab1);
              	PreparedStatement prepStmt1 = (PreparedStatement) conn.prepareStatement(   
  	                    "INSERT INTO app_details (`appId`, `appName`) VALUES (?,?)");
             prepStmt1.setString(1,upp[0]);
             prepStmt1.setString(2,upp[1]);
              rs1 = prepStmt1.executeUpdate();
              	 
                }
  				
   				while (result.next()) {
   					if(down[0].equals(result.getString(1)))
          		  {
          	  flag2=1;
          	  break;
          		  }
     				 
		       		  
				}
   				 
   				if(flag2!=1)
                 {
               	  tab1.setId(down[0]);
 	                  tab1.setName(down[1]);
               	  table1.add(tab1);
               	PreparedStatement prepStmt1 = (PreparedStatement) conn.prepareStatement(   
  	                    "INSERT INTO app_details (`appId`, `appName`) VALUES (?,?)");
             prepStmt1.setString(1,down[0]);
             prepStmt1.setString(2,down[1]);
              rs1 = prepStmt1.executeUpdate();
                 }
   				

              /*  for(int i=0;i<table1.size();i++)
                {
                System.out.println("id table1 before insertion------"+table1.get(i).getId());
                System.out.println("name table1 before insertion:------ "+table1.get(i).getName());
                System.out.println();
                }*/
                
             
                List<Table2> table2=new ArrayList<Table2>();
                   Table2 table11=new Table2();
	                  
                   table11.setParentid(a.getAppid());
                   table11.setChildid(down[0]);
                   table11.setIntegration(down[2]);
                   
                  table2.add(table11);
                  
                   Table2 table=new Table2();
                   table.setParentid(upp[0]);
                   table.setChildid(a.getAppid());
                   table.setIntegration(upp[2]);
                 table2.add(table);
                 
                 
              
         /*
	                     for(int i=0;i<table1.size();i++)
	                     {
	                    	 System.out.println("id table1 while insertion------"+table1.get(i).getId());
	                    	  PreparedStatement prepStmt1 = (PreparedStatement) conn.prepareStatement(   
	          	                    "INSERT INTO app_details (`appId`, `appName`) VALUES (?,?)");
	                     prepStmt1.setString(1,table1.get(i).getId());
	                     prepStmt1.setString(2,table1.get(i).getName());
	                      rs1 = prepStmt1.executeUpdate();
	                  
	                     }*/
	                     
	                     
	                     for(int i=0;i<table2.size();i++)
	    	                  {
	    	                  System.out.println("pid : "+table2.get(i).getParentid());
	    	                  System.out.println("cid : "+table2.get(i).getChildid());
	    	                  System.out.println("int : "+table2.get(i).getIntegration());
	    	                  System.out.println();
	    	                  }
	                     
	         
	                     
		                   for(int i=0;i<table2.size();i++)
	                     {
	                    	  PreparedStatement prepStmt2 = (PreparedStatement) conn.prepareStatement(   
	          	                    "INSERT INTO `stream` (`parentId`, `childId`, `integrated`) VALUES (?, ?, ?)");
	                     prepStmt2.setString(1,table2.get(i).getParentid());
	                     prepStmt2.setString(2,table2.get(i).getChildid());
	                     prepStmt2.setString(3,table2.get(i).getIntegration());
	                     rs2 = prepStmt2.executeUpdate();
	                  
	                     }
	                     
	                     
	                     return rs1+rs2;
	           
	}  
		   
		   public String deleteApp(String appid) throws SQLException
	       {
	//write the delete query here
			   
			   DbHandler db = DbHandler.getInstance();
				Connection conn = db.ObtainConnection();
			System.out.println("inside service appid :   "+ appid );
				PreparedStatement st = conn.prepareStatement("delete from stream where parentId = ? or childId = ?");
				st.setString(1,appid);
				st.setString(2,appid);
				
				
				//preparedStatement.setInt(1, appId);
			 st.executeUpdate(); 
				
				return "deleted";
						
	       }
		   
}
