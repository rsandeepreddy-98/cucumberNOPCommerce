package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static Properties properties;
	
	public ReadConfig() {
		try {
		FileInputStream fileInputStream = new FileInputStream("./Configurations/data.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public static String getUrl() {
		String url = properties.getProperty("");
		return url;
	}
}
