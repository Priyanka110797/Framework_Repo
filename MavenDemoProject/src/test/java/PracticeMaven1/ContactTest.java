package PracticeMaven1;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups="SmokeTest")
public void createContactTest() {
	String Browser=System.getProperty("browser");
	String URL=System.getProperty("url");
	String UN=System.getProperty("username");
	String PW=System.getProperty("password");
	
	System.out.println(Browser+"\t"+URL+"\t"+UN+"\t"+PW);		
	System.out.println("execute createContactTest");
}
@Test(groups="RegressionTest")
public void modifyContactTest() {
	System.out.println("execute modifyContactTest");
}

}
