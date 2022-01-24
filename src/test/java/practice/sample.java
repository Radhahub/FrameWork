package practice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample
{
  @Test
  public void sample()
   {
      String key="webdriver.chrome.driver";
      String value="./software/geckodriver.exe";
      System.setProperty(key, value);
      FirefoxDriver f1=new FirefoxDriver();
}
}
