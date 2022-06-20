package c_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class CC extends TestBase {
	@Test(dataProviderClass=RepoData.class,dataProvider="getDataCFamily")
	public void testCC (String user, String subject) throws Exception {
		log( "Starting CC");
		Thread.sleep(2000);
		log("Ending CC");
		log(user+"----" + subject);
	}
	
	
	
}
