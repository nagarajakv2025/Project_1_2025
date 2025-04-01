package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is a utility class which deals with Properties file
 * @author user
 * @version 1.0
 */
public class PropertiesUtility {
	/**
	 * This is a generic method to fetch a data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathUtility.proprtiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}
