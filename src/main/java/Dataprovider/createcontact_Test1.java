package Dataprovider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class createcontact_Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("majj sing");
    driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
    driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
				
		
}
}