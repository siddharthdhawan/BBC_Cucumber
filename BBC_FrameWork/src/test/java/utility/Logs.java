package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {
	
	Logger log;
	
	public Logger creteLog() {
		System.setProperty("filename", "bbc-rt");
		log=LogManager.getLogger(getClass());
		return log;
	}
}
