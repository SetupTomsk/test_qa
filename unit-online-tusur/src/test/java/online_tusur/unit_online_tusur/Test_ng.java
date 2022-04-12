package online_tusur.unit_online_tusur;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;

//import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;

//import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Optional;

public class Test_ng {

	 
	// тест для метода расчета среднего возраста
			
	@Test (priority=2, groups= {"testAge"}) 
	@Parameters ({"expAge"})
	public void testWithTestNG(@Optional("0") int expAge) {
			 Student[] students = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
						new Student("Aleksey", "Alekseev", 35), new Student("Oleg", "СидороВ", 35)};
	//	  System.out.println(expAge+ " ");

		 AssertJUnit.assertEquals(expAge,Student.avgAge(students));	
		 } 
	
	
	//для проверки среднего возраста	 
	@DataProvider(name="data")	
		public static Object[] ageData()
		{
	return new Object [] {20, 18, 35, 27};
		}
	
	@Test(priority=1, dataProvider="data")
	public void testWithTestNG1(@Optional("0") int expAge) {
		 Student[] students = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
					new Student("Aleksey", "Alekseev", 35), new Student("Oleg", "СидороВ", 35)};
 //   System.out.println((20+18+35+35)/4);
//	  System.out.println(expAge);
	 assertEquals(expAge,Student.avgAge(students));	
	 } 
	
	
	// проверка правильности регистра имени студента
	
	@DataProvider(name="studentsName")	
	public static String[][] studData1()
	{
return new String[][] {{"AleXandR","Alexandr"},{"Vladimir","Vladimir"},{"aleksey","Aleksey"},{"Alla-Victoriya","Alla-Victoriya"}};
	}
	
	@Test(priority=0, dataProvider="studentsName")
	public void testWithTestNG3(@Optional("null") String actStudents, @Optional("null") String expStudents) {
		Student s1 = new Student();
		s1.setFirstName(actStudents);
		
	//	System.out.println(actStudents+" "+expStudents+" "+s1.getFirstName());

		assertEquals(expStudents,s1.getFirstName());	
	 } 
	
	  
}
