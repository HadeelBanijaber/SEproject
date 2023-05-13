package pro;

import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;


	public class uses {
		

		static final String MONTH="2" ;
		
        protected static Map<String, String> ps;
		
	 protected static List<Map<String, String>>p;
	  
	 private uses() {
		 throw new IllegalStateException("No instances please!");
	  }
	
		 

		public static void test(DataTable dataTable) {
			p=dataTable.asMaps(String.class, String.class);
			
			
		}

		public static void genaratenumber() {
			String mo=MONTH;
			 String[] darr;
			 GFG.print("Name of The patients");
			
				for(int i=0 ;i<p.size();i++) {
					
					ps= p.get(i);
					String date=ps.get("date_visit");
				
				 darr = date.split("-");
				 if(darr[1].equals(mo)) {
					 
					 GFG.print(ps.get("firstname"));
					
				 }
			
		}
			
			
		}
			
	
			
			
			
		}

		
		




