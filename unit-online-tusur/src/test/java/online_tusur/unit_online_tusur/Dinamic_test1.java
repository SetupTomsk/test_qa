package online_tusur.unit_online_tusur;

import static org.testng.Assert.assertEquals;

//import java.util.Arrays;
//import java.util.Collection;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Dinamic_test1 {
	private Student s;
	private String nameStud;
    
  @DataProvider
  public static String[][] nameStudents()  {
	  return new String[][] {{"AleXandR","Alexandr"},{"Vladimir","Vladimir"},{"aleksey","Aleksey"},{"Alla-Victoriya","Alla-Victoriya"}};
	     }
  
	@Factory (dataProvider="nameStudents")
		public Dinamic_test1(@Optional("null") String actStudents, @Optional("null") String expStudents) {
		Student s1 = new Student();
		s1.setFirstName(actStudents);
		this.s=s1;
		nameStud=expStudents;
	}
	
	@Test
	public void test1 () {
	String expStudents=nameStud;
		assertEquals(expStudents, s.getFirstName());
	//	System.out.println(expStudents+" = "+s.getFirstName());
	}
	
}