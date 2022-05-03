package online_tusur.unit_online_tusur;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

@Execution(ExecutionMode.CONCURRENT)
public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   
//	private Student s1 = new Student();
//	private Student s2 = new Student();
	    
 //проверка возраста студента, выходящего за диапазон 
	@Tag ("Negative")
	@Test
	  void testN1_1() {
		int age = 15;
		s.setAge(age);
	    int expectedAge = 18;
		int actualsAge=s.getAge();
		
		long id=Thread.currentThread().getId();
		System.out.println(id);
		
		assertEquals(expectedAge, actualsAge);	
	  }
// проверка имени студента, начинающегося со строчной буквы
	@Tag ("Negative")
	@Test
	  void testN1_2() {
	    String name="светлана";
		s.setLastName(name);
		String expectedName="Светлана";
		String actualName=s.getLastName();
		
		long id=Thread.currentThread().getId();
		System.out.println(id);
		
	    assertEquals(expectedName, actualName);	
	  }
// проверка что все буквы фамилия, кроме первой, преобразуется в строчные буквы 
	
	@Tag ("Negative")
	@Test
	  void testN1_3() {
		String lname="ИвАнова";
		s.setLastName(lname);
		String expectedLName="Иванова";
		String actualLName=s.getLastName();
		
		long id=Thread.currentThread().getId();
		System.out.println(id);
		
	    assertEquals(expectedLName, actualLName);	
	  }
// проверка что правильно выводится полное имя "Фамилия Имя" 
	
	@Tag ("Negative")
	@Test
	void testN2() {
		String name="аННа";
		s.setFirstName(name);
		String lname="сиДОРОва";
		s.setLastName(lname);
		String expectedFullName="Сидорова Анна";
		String actualFullName=s.getFullName();
		
		long id=Thread.currentThread().getId();
		System.out.println(id);
		
		assertEquals(expectedFullName, actualFullName);	
	  }

// проверка что правильно выводится Имя"   
	
	  @Tag ("Positive")
	  @Test 
	  void testP1_1() {
		  String name="Sergey";
		  s.setFirstName(name);
		  String expectedName="Sergey";
		  String actualName=s.getFirstName();
		  
		long id=Thread.currentThread().getId();
		System.out.println(id);
		  
	    assertEquals(expectedName, actualName);
	   }

// тест не проходит, т.к. сложные имена преобразовывает в строчные буквы.
	  @Tag ("Positive")
	  @Test 
	  void testP2_1() {
		  String name="Пабло Диего Хосе Франциско де Паула Хуан Непомукено Криспин Криспиано де ла Сантисима Тринидад Руиз";
		  s.setFirstName(name);
		  String expectedName="Пабло Диего Хосе Франциско де Паула Хуан Непомукено Криспин Криспиано де ла Сантисима Тринидад Руиз";
		  String actualName=s.getFirstName();
		  
		long id=Thread.currentThread().getId();
		System.out.println(id);
		  
	    assertEquals(expectedName, actualName);
	   }

// проверка что правильно выводится фамилия" 
	  
	  @Tag ("Positive")
	  @Test 
	  void testP1_2() {
		  String name="Тупиков";
		  s.setLastName(name);
		  String expectedLName="Тупиков";
		  String actualLName=s.getLastName();
		  
		  long id=Thread.currentThread().getId();
			System.out.println(id);
		  
	    assertEquals(expectedLName, actualLName);
	   }

// проверка что правильно выводится полное имя "Фамилия Имя" на английском	  
	  
	    @Tag ("Positive")
		@Test
		void testP3() {
			String name="Sergey";
			s.setFirstName(name);
			String lname="Tupikov";
			s.setLastName(lname);
			String expectedFullName="Tupikov Sergey";
			String actualFullName=s.getFullName();
			
			long id=Thread.currentThread().getId();
			System.out.println(id);
			
			assertEquals(expectedFullName, actualFullName);	
	    }	  
  
	// Параметризированные тесты  
	 
// Параметризированный тест для метода расчета среднего возраста
	 @ParameterizedTest
	 @CsvSource({"20", "18", "35", "50", "27"})
	 void testWithCsvSource(String StudentAge) {
		 Student[] students = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
					new Student("Aleksey", "Alekseev", 35), new Student("Oleg", "СидороВ", 35)};
  /* System.out.println(StudentAge+ " ");
	System.out.println(Student.avgAge(students)); 
  */
	//assertEquals(Integer.parseInt(StudentAge),Integer.toString(Student.avgAge(students)));

		 long id=Thread.currentThread().getId();
			System.out.println(id);
		 		 
	assertEquals(Integer.parseInt(StudentAge),Student.avgAge(students));	
	 } 
	 
	 	 
/*	
// Динамические тесты
	@Tag ("Positive") 
	@TestFactory
	Collection<DynamicTest> dynamicTestGetLastName() {
		Student s1 = new Student("Alexandr", "Ivanov", 20);
		Student s2 = new Student("Vladimir", "Petrov", 18);
		Student s3 = new Student("Aleksey", "Alekseev", 35);
	
	return Arrays.asList(
			DynamicTest.dynamicTest("test1", () ->assertEquals(s1.getLastName(),"Ivanov")),
			DynamicTest.dynamicTest("test2", () ->assertEquals(s2.getLastName(),"Petrov")),
			DynamicTest.dynamicTest("test3", () ->assertEquals(s3.getLastName(),"Alekseev")),
	
			DynamicTest.dynamicTest("test4", () ->assertEquals(s1.getFirstName(),"Alexandr")),
			DynamicTest.dynamicTest("test5", () ->assertEquals(s2.getFirstName(),"Vladimir")),
			DynamicTest.dynamicTest("test6", () ->assertEquals(s3.getFirstName(),"Aleksey")),
			
			DynamicTest.dynamicTest("test7", () ->assertEquals(s1.getAge(),20)),
			DynamicTest.dynamicTest("test8", () ->assertEquals(s2.getAge(),18)),
			DynamicTest.dynamicTest("test9", () ->assertEquals(s3.getAge(),35)));
	}
	 
*/	 
	 
}