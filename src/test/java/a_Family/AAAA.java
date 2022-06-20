package a_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class AAAA extends TestBase {

	@Test(dataProviderClass=RepoData.class,dataProvider="getDataAFamily")
	public void testAAAA (String user, String subject) throws Exception {
		log( "Starting AAAA");
		Thread.sleep(2000);
		log("Ending AAAA");
		log(user+"----" + subject);
	}
	
	
}
