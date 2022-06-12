package Selenium_test.Selenium_tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


@TestInstance(Lifecycle.PER_CLASS)
public class TriangleTests {
  
	private WebDriver driver;

  @BeforeAll
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
    driver = new ChromeDriver();
  }
  
  @AfterAll
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testn_1() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
 //   driver.close();
  }
  
  @Test
  public void testn_2() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
  //  driver.close();
  }
  
  @Test
  public void testn_3() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("7");
    driver.findElement(By.name("vy")).click();
    driver.findElement(By.name("vy")).sendKeys("7");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/p[2]")).getText(),"Please provide 3 positive values, including at least one side.");
  //  driver.close();
  }
  
  @Test
  public void testn_4() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
    driver.manage().window().setSize(new Dimension(1244, 954));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.cssSelector("p:nth-child(4)")).getText(), "Please provide 3 positive values, including at least one side.");
  //  driver.close();
  }
  
  @Test
  public void testn_5() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
  //  driver.close();
  }
  
  @Test
  public void testn_6() {

	driver.get("https://www.calculator.net/triangle-calculator.html");
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
 //   driver.close();
  }
  
  @Test
  public void testn_7() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
  //  driver.close();
  }
  
  
  @Test
  public void testp_1() {
	    driver.get("https://www.calculator.net/triangle-calculator.html");
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
	//    driver.close();
	  }
  
  @Test
  public void testp_2() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
   // driver.close();
  }
  
  @Test
  public void testp_3() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
 //   driver.close();
  }

    @Test
    public void testp_4() {
      driver.get("https://www.calculator.net/triangle-calculator.html");
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
  //    driver.close();
    }
    
    @Test
    public void testp_5() {
      driver.get("https://www.calculator.net/triangle-calculator.html");
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
      driver.close();
    }
  
}
