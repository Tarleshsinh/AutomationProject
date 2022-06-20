package a_Family;


import org.testng.annotations.Test;


import dataprovide_repository.RepoData;
import testBase.TestBase;

public class A extends TestBase {

	
@Test(dataProviderClass=RepoData.class,dataProvider="getDataAFamily")
public void testA (String user, String subject) throws Exception {
	
	
	log( "Starting A");
	Thread.sleep(2000);
	log("Ending A");
	log(user+"----" + subject);
}

	
	
}
