package b_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class B extends TestBase{

	@Test(dataProviderClass=RepoData.class,dataProvider="getDataBFamily")
	public void testB (String user, String subject) throws Exception {
		log( "Starting B");
		Thread.sleep(2000);
		log("Ending B");
		log(user+"----" + subject);
	}
	
}
