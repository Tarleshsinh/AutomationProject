package a_Family;


import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class AAA extends TestBase  {
	
	@Test(dataProviderClass=RepoData.class,dataProvider="getDataAFamily")
	public void testAAA (String user, String subject) throws Exception {
		log( "Starting AAA");
		SoftAssert.assertEquals("Title 1", "Title");
		SoftAssert.assertEquals("Text 1", "Text 1");
		Thread.sleep(2000);
		log("Ending AAA");
		log(user+"----" + subject);
		//Assert.fail("Showing listener Example");
		SoftAssert.assertAll();
	}	
	
	
	
}
