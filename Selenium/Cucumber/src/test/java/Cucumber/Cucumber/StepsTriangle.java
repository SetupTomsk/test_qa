package Cucumber.Cucumber;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsTriangle {
	WebDriver driver;
	
	 @Given("^I use the triangle calculater$")
	    public void i_launch() throws Exception {
		    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
		    driver = new ChromeDriver();
	    driver.navigate().to("https://www.calculator.net/triangle-calculator.html");
	    }
	
	 @When("^I clear all parametr$")
	            public void clear() throws Exception 
	 {
		 driver.findElement(By.cssSelector(".clearbtn")).click();
	 }  
	@And("^I set value \"3\" for side \"A\"$")
	 public void i_Sat_A() throws Exception
	{
		driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("3");
	}
	
	@And("^I set value \"3\" for side \"B\"$")
	public void i_Sat_B() throws Exception
	{
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("3");
	}

	@And("^I set value \"3\" for side \"C\"$")
	public void i_Sat_C() throws Exception
	{
	    driver.findElement(By.name("vz")).click();
	    driver.findElement(By.name("vz")).sendKeys("3");
	}
	
	
	@And("^I Click \"Calculate\" button$")
	public void i_Calculate() throws Exception
	{
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	}
		 
 @Then("^The calculated result is \"Equilateral Triangle\"$")
	            public void i_verify() throws Exception {
	 assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Equilateral Triangle");
	 driver.close();
	        }
	                      
	

}
