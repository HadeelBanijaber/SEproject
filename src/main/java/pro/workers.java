package pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class workers {
	private static String did;
	private static String name;
	private static String specialty;
	private static String phone;
	private static String password;
	private static String city;
	private static String bill;
	static Map<String, String> ds;
	private static boolean ex=false;
	protected static ArrayList<String> doc=new ArrayList<String>();
	static final String PRINT="  |  ";	
	 private workers() {
		    throw new IllegalStateException("No instances please!");
		  }
	 public static void setdid(String b) {
		did=b;
		 
	 }
	 
	 public static Boolean getex() {
		 return ex;
	 }
	 
	 public static  void setname(String nam ) {
		  name=nam;
	 }
	 
	 public static void setss(String s) {
		 specialty=s;
	 }
	 
	 public static void setphone(String p) {
		 phone=p;
	 }
	 
	 public static void setpass(String p) {
		 password=p;
	 }
	 
	 public static void setcity(String cit) {
		  city=cit;
		 
	 }
	 
	 
	 public static void setbill(String string7) {
		 bill=string7;
	 }
	 

	public static boolean check(List<Map<String, String>> docData)
	{
		for(int i=0 ;i<docData.size();i++) {
			 ds= docData.get(i);
			 
				
		 if(did.equals(ds.get("Dr_id"))) {
				
				ex=true;
				break;
			
			
			}
		}
			if(!ex) {
				ex=false;
				doc.add(0,did);
				doc.add(name);
				doc.add(specialty);
				doc.add(phone);
				doc.add(password);
				doc.add(city);
				doc.add(bill);
				System.out.print("The worker with these informations added");
				System.out.print("|  "+did+PRINT+name+PRINT+specialty+PRINT+phone+PRINT+password+PRINT+city+PRINT+bill+PRINT);
			
			}
		
		
			
		
		return ex;
	}
	
}

