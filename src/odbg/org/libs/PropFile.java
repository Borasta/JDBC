package odbg.org.libs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author orlando
 *	
 *	@version 1.1
 */

public class PropFile {
	
	public static Properties getfile( String url ) {
		FileInputStream propFile = null;
		Properties prop = null;
		try {
			propFile = new FileInputStream(url + ".properties");
			prop = new Properties();
			prop.load(propFile);
			propFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
}
