package dbhandler;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbHandler {
	
	
	private static DbHandler db;
    private static Connection conn=null;
    public DbHandler()
    {
                   
    }
   
    public static DbHandler getInstance()
    {
                    if(db==null)
                                    db=new DbHandler();
                    return db;
    }

public Connection ObtainConnection() {
try {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("DB Connection");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/modified","root","root");
//conn=DriverManager.getConnection("jdbc:mysql://10.219.170.20:3306/test","test-root","test-root");
System.out.println("Success");
/*Properties prop = new Properties();
InputStream inputStream = DbHandler.class.getClassLoader().getResourceAsStream("/db.properties");
try {
prop.load(inputStream);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
String driver = prop.getProperty("driver");
String url = prop.getProperty("url");
String user = prop.getProperty("user");
String password = prop.getProperty("password");
Class.forName(driver);
Class.forName(driver);*/
//conn = DriverManager.getConnection(url, user, password);


}
catch (ClassNotFoundException e1) {

e1.printStackTrace();
}
catch (SQLException e) {

e.printStackTrace();
}
return conn;
}

public void CloseConnection()
{
try {
conn.close();
} catch (SQLException e) {

e.printStackTrace();
}
}


}
