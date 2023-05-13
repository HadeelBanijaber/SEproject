package pro;

import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;


	public class Uses {
		

		static final String MONTH="2" ;
		
        protected static Map<String, String> ps;
		
	 protected static List<Map<String, String>>p;
	  
	 private Uses() {
		 throw new IllegalStateException("No instances please!");
	  }
	
		 

		public static void test(DataTable dataTable) {
			p=dataTable.asMaps(String.class, String.class);
			
			
		}

		public static void genaratenumber() {
			String mo=MONTH;
			 String[] darr;
			 GFG.print("Name of The worker");
			
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

		
		




