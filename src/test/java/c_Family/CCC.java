package c_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class CCC extends TestBase {
	@Test(dataProviderClass=RepoData.class,dataProvider="getDataCFamily")
	public void testCCC (String user, String subject) throws Exception {
		log( "Starting CCC");
		Thread.sleep(2000);
		log("Ending CCC");
		log(user+"----" + subject);
	}
	
	
}
