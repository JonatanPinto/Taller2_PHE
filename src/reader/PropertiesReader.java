/**
 * 
 */
package reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private static PropertiesReader instance;
	private static Properties properties;
	/**
	 * 
	 */
	private PropertiesReader() {
		try {
			properties = new Properties();
			properties.load(new FileReader("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static PropertiesReader getInstance() {
		if (instance == null) {
			instance = new PropertiesReader();
		}
		return instance;
	}
	
	public static String getProperty(String property) {
		return properties.getProperty(property);
	}
}
