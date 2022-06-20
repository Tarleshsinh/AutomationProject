package b_Family;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovide_repository.RepoData;
import testBase.TestBase;

public class BB extends TestBase {

	@Test(dataProviderClass=RepoData.class,dataProvider="getDataBFamily")
	public void testBB (String user, String subject) throws Exception {
		System.out.println("Starting BB");
		test.log(Status.INFO, "Starting BB");
		Thread.sleep(2000);
		System.out.println("Ending BB");
		test.log(Status.INFO, "Ending BB");
		log(user+"----" + subject);
	}
	
	
}
