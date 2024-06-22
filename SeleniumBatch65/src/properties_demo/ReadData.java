package properties_demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadData {
	
	@Test
	public void demo() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Selenium\\Workspace\\SeleniumBatch65\\src\\properties_demo\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String userName = prop.getProperty("user");
		String password = prop.getProperty("pwd");
		
		System.out.println(userName);
		System.out.println(password);
		
		/*
		String place = "Ooty";
		int x = 100;
		
		System.out.println(place+x);
		System.out.println(x+1+2+3);
		System.out.println(place+1+2+3);
		*/
		
		int x = 22;
		
		System.out.println(userName+x);
	}

}
