package a_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class AA extends TestBase {

	@Test(dataProviderClass=RepoData.class,dataProvider="getDataAFamily")
	public void testAA (String user, String subject) throws Exception {
		log( "Starting AA");
		Thread.sleep(2000);
		log("Ending AA");
		log(user+"----" + subject);
	}
	
	
}
