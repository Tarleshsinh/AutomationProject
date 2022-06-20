package b_Family;

import org.testng.annotations.Test;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class BBB extends TestBase{

	
	@Test(dataProviderClass=RepoData.class,dataProvider="getDataBFamily")
	public void testBBB (String user, String subject) throws Exception {
		log( "Starting BBB");
		Thread.sleep(2000);
		log("Ending BBB");
		log(user+"----" + subject);
	}
}
