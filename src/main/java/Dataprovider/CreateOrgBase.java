package Dataprovider;

import org.testng.annotations.Test;

import com.crm.comcast_genericlibraries.BaseClass;
import com.crm.pomobjpage.Home;
import com.crm.pomobjpage.createnewOrganizationpage;
import com.crm.pomobjpage.organization;
import com.crm.pomobjpage.organizationInfo;

public class CreateOrgBase extends BaseClass
{
@Test
public void CreateOrgBase() throws Throwable
{
	int randomInt = jLib.getRanDomNumber();
	/*test script Data*/
	String orgName = eLib.getDataFromExcel("Sheet1", 1, 2) + randomInt;

    /*step 2 : navigate to organization*/
    Home homePage = new Home(driver);
    homePage.getOrganizationLnk().click();
    
    /*step 3 : navigate to "create new organization"page by click on "+" image */
    organization orgPage = new organization(driver);
    orgPage.getCreateOrgImg().click();
    
    /*step 4 : create organization*/
    createnewOrganizationpage cno = new createnewOrganizationpage(driver);
    cno.createOrg(orgName);
    
   /*step 5 : verify the successful msg with org name*/
    organizationInfo orginfoPage = new organizationInfo(driver);
    String  actSuccesfullMg =  orginfoPage.getSuccesfullMsg().getText();
    if(actSuccesfullMg.contains(orgName)) {
    	System.out.println(orgName + "==>created successfully");
    }else {
    	System.out.println(orgName + "==> not created successfully");

    }
}


@Test
public void createOrgWithIndutriesTest() throws Throwable {
	/*test script Data*/
	int randomInt = jLib.getRanDomNumber();
	String orgName = eLib.getDataFromExcel("Sheet1", 4, 2) + randomInt;
	String industriesType = eLib.getDataFromExcel("Sheet1", 4, 3);
	 /*step 2 : navigate to organization*/
    Home homePage = new Home(driver);
    homePage.getOrganizationLnk().click();
    
    /*step 3 : navigate to "create new organization"page by click on "+" image */
    organization orgPage = new organization(driver);
    orgPage.getCreateOrgImg().click();
    
    /*step 4 : create organization*/
    createnewOrganizationpage cno = new createnewOrganizationpage(driver);
    cno.createOrg(orgName, industriesType);
    
    /*verify orgname & industry */
    organizationInfo orginfoPage = new organizationInfo(driver);
    String  actSuccesfullMg =  orginfoPage.getSuccesfullMsg().getText();
    if(actSuccesfullMg.contains(orgName)) {
    	System.out.println(orgName + "==>created successfully");
    }else {
    	System.out.println(orgName + "==> not created successfully");

    }
    
    String actIndustryType = orginfoPage.getIndutryTypeInfo().getText();
    if(actIndustryType.equals(industriesType)) {
    	System.out.println(industriesType + "==>industry is verified successfully");
    }else {
    	System.out.println(industriesType + "==>industry is not verified successfully");

    }
}

@Test
public void createOrgWithRatingTest() throws Throwable {
	/*test script Data*/
	int randomInt = jLib.getRanDomNumber();
	String orgName = eLib.getDataFromExcel("Sheet1", 7, 2) + randomInt;
	String rating = eLib.getDataFromExcel("Sheet1", 7, 3);
	   /*step 2 : navigate to organization*/
    Home homePage = new Home(driver);
    homePage.getOrganizationLnk().click();
    
    /*step 3 : navigate to "create new organization"page by click on "+" image */
    organization orgPage = new organization(driver);
    orgPage.getCreateOrgImg().click();
    
    /*step 4 : create organization*/
    createnewOrganizationpage cno = new createnewOrganizationpage(driver);
    cno.createOrg(orgName, rating, true);
    
    /*verify orgname & industry */
    organizationInfo orginfoPage = new organizationInfo(driver);
    String  actSuccesfullMg =  orginfoPage.getSuccesfullMsg().getText();
    if(actSuccesfullMg.contains(orgName)) {
    	System.out.println(orgName + "==>created successfully");
    }else {
    	System.out.println(orgName + "==> not created successfully");

    }       
    String actRatingType = orginfoPage.getRatingTypeinfo().getText();
    
    if(actRatingType.equals(rating)) {
    	System.out.println(rating + "==>industry is verified successfully");
    }else {
    	System.out.println(rating + "==>industry is not verified successfully");

    }
}



}

