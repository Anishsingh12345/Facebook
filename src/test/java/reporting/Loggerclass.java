package reporting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggerclass {
	
	public static Logger log;
	
	public void Loggerclass1()
	{
		
		log = LogManager.getLogger();
		log.info("passed successfully");
	}
	
	
}
