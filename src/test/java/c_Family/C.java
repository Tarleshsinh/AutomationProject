package c_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class C extends TestBase{

	@Test(dataProviderClass=RepoData.class,dataProvider="getDataCFamily")
	public void testC (String user, String subject) throws Exception {
		log( "Starting C");
		Thread.sleep(2000);
		log("Ending C");
		log(user+"----" + subject);
		
	}
	
}
