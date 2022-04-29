package mavenExecution;

import org.testng.annotations.Test;

public class ReadDataFromCommandLineTest {
      
	@Test(groups="smokeTest")
	public void readDataFromCommandLineTest()
	{
		//System.out.println("Executing test Scripts from command line");
		
		System.out.println("This is smoke Testing");
	
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}
	
	@Test(groups="regrationTest")
	public void regrasionTestScrip()
	{
		System.out.println("This is regration Testing");
	}
	
}
