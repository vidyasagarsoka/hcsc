package bean;

public class ConvertStream {
	public String[] convert(String s)
	{
		String s1=     s.replace("[{", "");
        String s2=s1.replace("}]", "");
        String s3=s2.replace("uappid", "");
        String s4=s3.replace("uappname", "");
        String s5=s4.replace("integration","");
        String s6=s5.replace("\":\"","");
        String s7=s6.replace(":","");
        String s8=s7.replace("\"","");
       
        System.out.println("Splitted one :"+s8);
String[] m=s8.split(",");
System.out.println("Splitted array:"+m[0]);
return m;
	}
	
	public String[] convertdown(String s)
	{
		String s1=     s.replace("[{", "");
        String s2=s1.replace("}]", "");
        String s3=s2.replace("dappid", "");
        String s4=s3.replace("dappname", "");
        String s5=s4.replace("integration","");
        String s6=s5.replace("\":\"","");
        String s7=s6.replace(":","");
        String s8=s7.replace("\"","");
       
        System.out.println("Splitted one :"+s8);
String[] m=s8.split(",");
System.out.println("Splitted array:"+m[0]);
return m;
	}

}
