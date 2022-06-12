package Cucumber.Cucumber;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	 @Given("^I use the calculater$")
	    public void i_launch() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.calculator.net/math-calculator.html");
	    }
	
	 @When("^I enter \"1\" into the calculator$")
	            public void i_insert_1() throws Exception 
	 {
		 driver.findElement(By.xpath("//span[@onclick=\'r(1)\']")).click();
	 }  
	@And("^I add \"200\"$")
	 public void i_add_200() throws Exception
	{
		driver.findElement(By.xpath("//span[@onclick=\"r(\'+\')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(2)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(0)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(0)\']")).click();
	    }
	
	@And("^I subtract \"200\"$")
	public void i_subtract_200() throws Exception
	{
		 driver.findElement(By.xpath("//span[@onclick=\"r(\'-\')\"]")).click();
		 driver.findElement(By.xpath("//span[@onclick=\'r(2)\']")).click();
		 driver.findElement(By.xpath("//span[@onclick=\'r(0)\']")).click();
		 driver.findElement(By.xpath("//span[@onclick=\'r(0)\']")).click();
		
			}

	@And("^I divide by \"555\"$")
	public void i_divide_555() throws Exception
	{
	    driver.findElement(By.xpath("//span[@onclick=\"r(\'/\')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
		
			}
	
	
	@And("^I multiply by \"555\"$")
	public void i_multiply_555() throws Exception
	{
	    driver.findElement(By.xpath("//span[@onclick=\"r(\'*\')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
		
			}
		 
 @Then("^the calculated result is \"1\"$")
	            public void i_verify() throws Exception {
	 assertEquals(driver.findElement(By.id("sciOutPut")).getText()," 1");
	 driver.close();
	        }
	                      

	
	

}
