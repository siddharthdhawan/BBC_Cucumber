package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	
	public Properties prop;
	
	public ConfigRead() {
		File src=new File("./config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDriverPath() {
		String dp=prop.getProperty("driverpath");
		return dp;
	}
	public String getAuthor() {
		String author=prop.getProperty("author");
		return author;
	}
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportconfigpath");
		if(reportConfigPath!= null)
			return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
