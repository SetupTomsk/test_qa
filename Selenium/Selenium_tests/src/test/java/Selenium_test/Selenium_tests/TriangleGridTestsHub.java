package Selenium_test.Selenium_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;


@TestInstance(Lifecycle.PER_CLASS)
public class TriangleGridTestsHub {
  
	private WebDriver driver;
	
	String baseURL, nodeURL1;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;

  @BeforeAll
  public void setUp_1() throws MalformedURLException {
	      baseURL="https://www.calculator.net/triangle-calculator.html";
	      nodeURL1="http://192.168.43.251:4444";
  }
   
  @AfterEach
  public void tearDown_1() {
	  driver.quit();

  }

@Test
  public void testn_1() throws Throwable {
	  System.out.println("Executing on FireFox");
      DesiredCapabilities capability=new DesiredCapabilities();
      capability.setBrowserName("firefox");
      capability.setPlatform(Platform.WIN10); 
    driver=new RemoteWebDriver(new URL(nodeURL1),capability);
	driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("1");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("1");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("5");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
  }
 
  @Test
  public void testn_1_1() throws Throwable {
	  System.out.println("Executing on Microsoft Edge");
      DesiredCapabilities capability=new DesiredCapabilities();
      capability.setBrowserName("MicrosoftEdge");
      capability.setPlatform(Platform.WIN10); 
    driver=new RemoteWebDriver(new URL(nodeURL1),capability);
	driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("1");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("1");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("5");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
  }

  @Test
  public void testn_2() throws Throwable {
	  
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vc")).click();
    driver.findElement(By.name("vc")).sendKeys("110");
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("5");
    driver.findElement(By.name("va")).click();
    driver.findElement(By.name("va")).sendKeys("90");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"These three values can not be used to create an valid triangle.");
  }

  @Test
  public void testn_3() throws Throwable {
    System.out.println("Executing on FireFox");
    DesiredCapabilities capability=new DesiredCapabilities();
    capability.setBrowserName("firefox");
    capability.setPlatform(Platform.WIN10); 
    driver=new RemoteWebDriver(new URL(nodeURL1),capability);
	driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("7");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("7");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"Please provide 3 positive values, including at least one side.");
  }
  
  @Test
  public void testn_4() throws Throwable {
	System.out.println("Executing on FireFox");
    DesiredCapabilities capability=new DesiredCapabilities();
    capability.setBrowserName("firefox");
    capability.setPlatform(Platform.WIN10); 
    driver=new RemoteWebDriver(new URL(nodeURL1),capability);
	driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.cssSelector("p:nth-child(4)")).getText(), "Please provide 3 positive values, including at least one side.");
  }

  @Test
  public void testn_5() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("10000000000000000000");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("10000000000000000000");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("10");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
  }
  
  @Test
  public void testn_6() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("angleunits")).click();
    driver.findElement(By.xpath("//option[. = 'radian']")).click();
    driver.findElement(By.name("vc")).click();
    driver.findElement(By.name("vc")).sendKeys("5");
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("5");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("5");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//p[contains(.,\'Angle \"c\" too big.\')]")).getText(),"Angle \"c\" too big.");
  }
  
  @Test
  public void testn_7() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vc")).click();
    driver.findElement(By.name("vc")).sendKeys("60");
    driver.findElement(By.name("va")).click();
    driver.findElement(By.name("va")).sendKeys("60");
    driver.findElement(By.name("vb")).click();
    driver.findElement(By.name("vb")).sendKeys("60");
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("5");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("5");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("5");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"Please provide three positive values only. You have 6 now.");
  }
  
  
  @Test
  public void testp_1() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
	    driver.manage().window().setSize(new Dimension(1244, 954));
	    driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("5");
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("5");
	    driver.findElement(By.name("vz")).click();
	    driver.findElement(By.name("vz")).sendKeys("5");
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Equilateral Triangle");
	  }
  
  @Test
  public void testp_2() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("5");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("5");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("4");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Acute Isosceles Triangle");
  }
  
  @Test
  public void testp_3() throws Throwable {
	  System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(nodeURL1), cap);
    driver.get(baseURL);
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("3");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("4");
    driver.findElement(By.name("vz")).click();
    driver.findElement(By.name("vz")).sendKeys("5");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Right Scalene Triangle");
  }

    @Test
    public void testp_4() throws Throwable{
    	System.out.println("Executing on CHROME");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);
      driver = new RemoteWebDriver(new URL(nodeURL1), cap);
      driver.get(baseURL);
      driver.findElement(By.cssSelector(".clearbtn")).click();
      driver.findElement(By.name("vc")).click();
      driver.findElement(By.name("vc")).sendKeys("50");
      driver.findElement(By.name("va")).click();
      driver.findElement(By.name("va")).sendKeys("60");
      driver.findElement(By.name("vb")).click();
      driver.findElement(By.name("vb")).sendKeys("70");
      driver.findElement(By.name("vy")).click();
      driver.findElement(By.name("vy")).sendKeys("5");
      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
      assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Acute Scalene Triangle");
    }
    
    @Test
    public void testp_5() throws Throwable {
      System.out.println("Executing on FireFox");
      DesiredCapabilities capability=new DesiredCapabilities();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.WIN10); 
      driver=new RemoteWebDriver(new URL(nodeURL1),capability);
      driver.get(baseURL);
      driver.manage().window().setSize(new Dimension(1244, 954));
      driver.findElement(By.cssSelector(".clearbtn")).click();
      driver.findElement(By.name("vc")).click();
      driver.findElement(By.name("vc")).sendKeys("110");
      driver.findElement(By.name("vx")).click();
      driver.findElement(By.name("vx")).sendKeys("10");
      driver.findElement(By.name("vy")).click();
      driver.findElement(By.name("vy")).sendKeys("10");
      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
      assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Obtuse Isosceles Triangle");
    }

}
