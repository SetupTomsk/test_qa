package Selenium_test.Selenium_tests;

import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;


public class TriangleGridTestsNGHub {
  
		FirefoxDriver driver1;
		ChromeDriver driver2;
		EdgeDriver driver3;
		
	String baseURL, nodeURL;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		
	baseURL="https://www.calculator.net/triangle-calculator.html";
	nodeURL="http://localhost:4444";

	}
 
 @Test
  public void testn_1() throws Throwable {
	 System.out.println("Executing on FireFox");
	    System.setProperty("webdriver.gecko.driver", "C:\\work\\Selenium\\geckodriver.exe");
	    FirefoxOptions options = new FirefoxOptions();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		 	driver1 = new FirefoxDriver(options);
	driver1.get(baseURL);
    driver1.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver1.findElement(By.cssSelector(".clearbtn")).click();
    driver1.findElement(By.name("vx")).click();
    driver1.findElement(By.name("vx")).sendKeys("1");
    driver1.findElement(By.name("vy")).click();
    driver1.findElement(By.name("vy")).sendKeys("1");
    driver1.findElement(By.name("vz")).click();
    driver1.findElement(By.name("vz")).sendKeys("5");
    driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver1.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
    driver1.quit();
 }

  @Test
  public void testn_1_1() throws Throwable {
	  System.out.println("Executing on Edge");
	    System.setProperty("webdriver.edge.driver", "C:\\work\\Selenium\\msedgedriver.exe");
	    EdgeOptions options = new EdgeOptions();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		 
			driver3 = new EdgeDriver();
	driver3.get(baseURL);
//    driver3.manage().window().setSize(new Dimension(1244, 954));
    driver3.findElement(By.cssSelector(".clearbtn")).click();
    driver3.findElement(By.name("vx")).click();
    driver3.findElement(By.name("vx")).sendKeys("1");
    driver3.findElement(By.name("vy")).click();
    driver3.findElement(By.name("vy")).sendKeys("1");
    driver3.findElement(By.name("vz")).click();
    driver3.findElement(By.name("vz")).sendKeys("5");
    driver3.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver3.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
    driver3.quit();
  }

  @Test
  public void testn_2() throws Throwable {
	System.out.println("Executing on CHROME");
    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	capabilities.setBrowserName("chrome");     
	capabilities.setPlatform(Platform.WINDOWS);
	driver2 = new ChromeDriver(options);
    driver2.get(baseURL);
    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver2.findElement(By.cssSelector(".clearbtn")).click();
    driver2.findElement(By.name("vc")).click();
    driver2.findElement(By.name("vc")).sendKeys("110");
    driver2.findElement(By.name("vx")).click();
    driver2.findElement(By.name("vx")).sendKeys("5");
    driver2.findElement(By.name("va")).click();
    driver2.findElement(By.name("va")).sendKeys("90");
    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"These three values can not be used to create an valid triangle.");
    driver2.quit();
  }

  @Test
  public void testn_3() throws Throwable {
	  System.out.println("Executing on CHROME");
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("chrome");     
		capabilities.setPlatform(Platform.WINDOWS);
		driver2 = new ChromeDriver(options);
	driver2.get(baseURL);
    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver2.findElement(By.cssSelector(".clearbtn")).click();
    driver2.findElement(By.name("vx")).click();
    driver2.findElement(By.name("vx")).sendKeys("7");
    driver2.findElement(By.name("vy")).click();
    driver2.findElement(By.name("vy")).sendKeys("7");
    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"Please provide 3 positive values, including at least one side.");
    driver2.quit();
  }
  
  @Test
  public void testn_4() throws Throwable {
	  System.out.println("Executing on CHROME");
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("chrome");     
		capabilities.setPlatform(Platform.WINDOWS);
		driver2 = new ChromeDriver(options);
	driver2.get(baseURL);
    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver2.findElement(By.cssSelector(".clearbtn")).click();
    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver2.findElement(By.cssSelector("p:nth-child(4)")).getText(), "Please provide 3 positive values, including at least one side.");
    driver2.quit();
  }

  @Test
  public void testn_5() throws Throwable {
	  System.out.println("Executing on FireFox");
	    System.setProperty("webdriver.gecko.driver", "C:\\work\\Selenium\\geckodriver.exe");
	    FirefoxOptions options = new FirefoxOptions();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		 	driver1 = new FirefoxDriver(options);
    driver1.get(baseURL);
    driver1.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver1.findElement(By.cssSelector(".clearbtn")).click();
    driver1.findElement(By.name("vx")).click();
    driver1.findElement(By.name("vx")).sendKeys("10000000000000000000");
    driver1.findElement(By.name("vy")).click();
    driver1.findElement(By.name("vy")).sendKeys("10000000000000000000");
    driver1.findElement(By.name("vz")).click();
    driver1.findElement(By.name("vz")).sendKeys("10");
    driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver1.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(), "The sum of two sides must be larger than the third.");
    driver1.quit();
  }
  
  @Test
  public void testn_6() throws Throwable {
	  System.out.println("Executing on FireFox");
	    System.setProperty("webdriver.gecko.driver", "C:\\work\\Selenium\\geckodriver.exe");
	    FirefoxOptions options = new FirefoxOptions();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		 	driver1 = new FirefoxDriver(options);
    driver1.get(baseURL);
    driver1.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver1.findElement(By.cssSelector(".clearbtn")).click();
    driver1.findElement(By.name("angleunits")).click();
    driver1.findElement(By.xpath("//option[. = 'radian']")).click();
    driver1.findElement(By.name("vc")).click();
    driver1.findElement(By.name("vc")).sendKeys("5");
    driver1.findElement(By.name("vx")).click();
    driver1.findElement(By.name("vx")).sendKeys("5");
    driver1.findElement(By.name("vy")).click();
    driver1.findElement(By.name("vy")).sendKeys("5");
    driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver1.findElement(By.xpath("//p[contains(.,\'Angle \"c\" too big.\')]")).getText(),"Angle \"c\" too big.");
    driver1.quit();
  }
  
  @Test
  public void testn_7() throws Throwable {
	  System.out.println("Executing on CHROME");
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("chrome");     
		capabilities.setPlatform(Platform.WINDOWS);
		driver2 = new ChromeDriver(options);
    driver2.get(baseURL);
    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver2.findElement(By.cssSelector(".clearbtn")).click();
    driver2.findElement(By.name("vc")).click();
    driver2.findElement(By.name("vc")).sendKeys("60");
    driver2.findElement(By.name("va")).click();
    driver2.findElement(By.name("va")).sendKeys("60");
    driver2.findElement(By.name("vb")).click();
    driver2.findElement(By.name("vb")).sendKeys("60");
    driver2.findElement(By.name("vx")).click();
    driver2.findElement(By.name("vx")).sendKeys("5");
    driver2.findElement(By.name("vy")).click();
    driver2.findElement(By.name("vy")).sendKeys("5");
    driver2.findElement(By.name("vz")).click();
    driver2.findElement(By.name("vz")).sendKeys("5");
    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"Please provide three positive values only. You have 6 now.");
    driver2.quit();
  }
  
  
  @Test
  public void testp_1() throws Throwable {
	  System.out.println("Executing on CHROME");
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("chrome");     
		capabilities.setPlatform(Platform.WINDOWS);
		driver2 = new ChromeDriver(options);
		driver2.get(baseURL);
	    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
	    driver2.findElement(By.cssSelector(".clearbtn")).click();
	    driver2.findElement(By.name("vx")).click();
	    driver2.findElement(By.name("vx")).sendKeys("5");
	    driver2.findElement(By.name("vy")).click();
	    driver2.findElement(By.name("vy")).sendKeys("5");
	    driver2.findElement(By.name("vz")).click();
	    driver2.findElement(By.name("vz")).sendKeys("5");
	    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Equilateral Triangle");
	    driver2.quit();
  }
  
  @Test
  public void testp_2() throws Throwable {
	  System.out.println("Executing on CHROME");
	    System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("chrome");     
		capabilities.setPlatform(Platform.WINDOWS);
		driver2 = new ChromeDriver(options);
    driver2.get(baseURL);
    driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver2.findElement(By.cssSelector(".clearbtn")).click();
    driver2.findElement(By.name("vx")).click();
    driver2.findElement(By.name("vx")).sendKeys("5");
    driver2.findElement(By.name("vy")).click();
    driver2.findElement(By.name("vy")).sendKeys("5");
    driver2.findElement(By.name("vz")).click();
    driver2.findElement(By.name("vz")).sendKeys("4");
    driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Acute Isosceles Triangle");
    driver2.quit();
  }
  
  @Test
  public void testp_3() throws Throwable {
	  System.out.println("Executing on FireFox");
	    System.setProperty("webdriver.gecko.driver", "C:\\work\\Selenium\\geckodriver.exe");
	    FirefoxOptions options = new FirefoxOptions();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		 	driver1 = new FirefoxDriver(options);
    driver1.get(baseURL);
    driver1.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
    driver1.findElement(By.cssSelector(".clearbtn")).click();
    driver1.findElement(By.name("vx")).click();
    driver1.findElement(By.name("vx")).sendKeys("3");
    driver1.findElement(By.name("vy")).click();
    driver1.findElement(By.name("vy")).sendKeys("4");
    driver1.findElement(By.name("vz")).click();
    driver1.findElement(By.name("vz")).sendKeys("5");
    driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    Assert.assertEquals(driver1.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Right Scalene Triangle");
    driver1.quit();
  }

    @Test
    public void testp_4() throws Throwable{
    	 System.out.println("Executing on FireFox");
 	    System.setProperty("webdriver.gecko.driver", "C:\\work\\Selenium\\geckodriver.exe");
 	    FirefoxOptions options = new FirefoxOptions();
 		  DesiredCapabilities capabilities = new DesiredCapabilities();
 			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);		
 			capabilities.setBrowserName("firefox");
 			capabilities.setPlatform(Platform.WINDOWS);
 		 	driver1 = new FirefoxDriver(options);
      driver1.get(baseURL);
      driver1.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
      driver1.findElement(By.cssSelector(".clearbtn")).click();
      driver1.findElement(By.name("vc")).click();
      driver1.findElement(By.name("vc")).sendKeys("50");
      driver1.findElement(By.name("va")).click();
      driver1.findElement(By.name("va")).sendKeys("60");
      driver1.findElement(By.name("vb")).click();
      driver1.findElement(By.name("vb")).sendKeys("70");
      driver1.findElement(By.name("vy")).click();
      driver1.findElement(By.name("vy")).sendKeys("5");
      driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
      Assert.assertEquals(driver1.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Acute Scalene Triangle");
      driver1.quit();
    }
    
    @Test
    public void testp_5() throws Throwable {
    	System.out.println("Executing on CHROME");
        System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	capabilities.setBrowserName("chrome");     
    	capabilities.setPlatform(Platform.WINDOWS);
    	driver2 = new ChromeDriver(options);
      driver2.get(baseURL);
      driver2.manage().window().setSize(new org.openqa.selenium.Dimension(1244, 954));
      driver2.findElement(By.cssSelector(".clearbtn")).click();
      driver2.findElement(By.name("vc")).click();
      driver2.findElement(By.name("vc")).sendKeys("110");
      driver2.findElement(By.name("vx")).click();
      driver2.findElement(By.name("vx")).sendKeys("10");
      driver2.findElement(By.name("vy")).click();
      driver2.findElement(By.name("vy")).sendKeys("10");
      driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
      Assert.assertEquals(driver2.findElement(By.xpath("//div[@id=\'content\']/table/tbody/tr/td/h3")).getText(), "Obtuse Isosceles Triangle");
      driver2.quit();
    }
  
}
