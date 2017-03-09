package odbg.org.main;

import java.util.Properties;

import odbg.org.libs.JDBC;
import odbg.org.libs.PropFile;

public class Main {

	public static void main(String[] args) {
		Properties prop = PropFile.getfile("database");
		
		System.out.println(prop);
		
		JDBC pg = new JDBC(prop);
		
		System.out.println(pg.getConnectionStatus());
		
	}

}
