package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		//location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Loading properties file
		Properties prop=new Properties();
		prop.load(file);
		
		//Reading data from properties file
		String appurl=prop.getProperty("url");
		String emailid = prop.getProperty("email");
		String uname = prop.getProperty("username");
		String pwd= prop.getProperty("pwd");
		
		System.out.println(appurl+"		"+emailid+ "	"+uname+"	"+pwd);
		
		//Reading all the keys from properties file - 

		//1st approach
		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys);  //[pwd, url, email, username]
		
		//2nd approach
		
		Set<Object> keys_config = prop.keySet();
		System.out.println(keys_config);  //[pwd, url, email, username]
		
		//Reading all the values from properties file
		Collection<Object> config_values = prop.values();
		System.out.println(config_values);  //[admin123, https://demo.opencart.com, example@domain.com, Admin]
		
		file.close();
	}

}
