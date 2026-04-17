package PracticeMaven2;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups="SmokeTest")
public void createOrgTest() {
	System.out.println("execute createOrgTest");
}
@Test(groups="RegressionTest")
public void modifyOrgTest() {
	System.out.println("execute modifyOrgTest");
}

}
