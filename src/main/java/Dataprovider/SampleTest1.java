package Dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast_genericlibraries.BaseClass;

public class SampleTest1  extends BaseClass
{
@Test(retryAnalyzer=AnnotationClass.RetryImpClass.class)

	public void amazonTest()
	{
Assert.assertEquals("A", "B");
	}



}
