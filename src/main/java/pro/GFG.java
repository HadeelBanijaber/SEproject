package pro;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class GFG {
	 private GFG () {
		    throw new IllegalStateException("No instances please!");
		  }


	public static void print(String sen) {
		
		Logger logger
        = Logger.getLogger(
            Logger.class.getName());

    // create logRecords
    LogRecord record1 = new LogRecord(Level.INFO,
    		sen);
    
    logger.log(record1);
  

	}}