package pro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import softwareproject.GFG;

import java.util.List;
import java.util.Map;



public class Biil {
	private static  String pID;
	private static String dID;
	private static String bookdate;
	private static Integer hour ;
	private static Integer min ;
	private static String ll;
	static final String MONTH="2";
	static final String BOOKDAT="bookdate";
    protected String date;
	protected static Map<String, String> books;
	private static boolean correct=false;
	protected static Integer c=0;
	protected static List<Map<String, String>> booking;
	private static Integer sum=0;
	
	
	public static void setpid(String pid) {
		pID=pid;
	}
	public static String getbill() {
		return ll;
	}
	
	
	
	
	public static void setcor(Boolean corr) {
		correct=corr;
	}
	public static boolean getcor() {
		return correct;
	}
	
	
	
	
	public static void sethour(Integer did) {
		 hour=did;
	}
	
	public static void find(List<Map<String, String>> bookings) 
	{
		booking=bookings;
		for(int i=0 ;i<bookings.size();i++) {
			
			c=i;
			 books= bookings.get(i);
			 sum=sum+Integer.parseInt(books.get("Bill"));
			 GFG.print(books.get("Bill"));
			 if(pID.equals(books.get("id"))) {
				 dID= books.get("w_id");
				 bookdate= books.get(BOOKDAT);
				 if(correct) {
				 String bookt= books.get("booktime");
				 String[] ar;
						ar = bookt.split(":");
						hour=Integer.parseInt(ar[0]);
						min= Integer.parseInt(ar[1]);
						
				 }
				 ll= books.get("Bill"); 
			   
			 }
		 
	 }
		
			if(!correct) {
				for(int i=0 ;i<bookings.size();i++) {
					books=bookings.get(i);
					if(dID.equals(books.get("w_id"))&&bookdate.equals(books.get(BOOKDAT))&&!pID.equals(books.get("id"))){
						
							GFG.print("Sorry the worker have another customer now  "+books.get("id"));
						hour= hour+1;
						GFG.print("Your another book time at: "+hour+ ":"+min);
						
					}
				}
		} 
	}
	public void genaratebills() {
		int summ=0;
		String mon=MONTH;
	
for(int i=0 ;i<booking.size();i++) {
			
			 date=booking.get(i).get(BOOKDAT);
			 
			 String[] darr;
			 darr = date.split("-");
			 if(darr[1].equals(mon)) {
				 
				summ=summ+Integer.parseInt(books.get("Bill"));
			 }
}
        
GFG.printint(summ);
}

	public static void setmin(Integer int2) {
		min=int2;
	}
	
	
	
}
