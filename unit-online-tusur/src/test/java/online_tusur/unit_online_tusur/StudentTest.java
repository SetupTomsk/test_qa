package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   

	    
/* проверка возраста студента, выходящего за диапазон */
	@Tag ("Negative")
	@Test
	  void testN1_1() {
		int age = 15;
		s.setAge(age);
	    int expectedAge = 18;
		int actualsAge=s.getAge();
		assertEquals(expectedAge, actualsAge);	
	  }
/* проверка имени студента, начинающегося со строчной буквы */
	@Tag ("Negative")
	@Test
	  void testN1_2() {
	    String name="светлана";
		s.setLastName(name);
		String expectedName="Светлана";
		String actualName=s.getLastName();
	    assertEquals(expectedName, actualName);	
	  }
/* проверка что все буквы фамилия, кроме первой, преобразуется в строчные буквы */
	
	@Tag ("Negative")
	@Test
	  void testN1_3() {
		String lname="ИвАнова";
		s.setLastName(lname);
		String expectedLName="Иванова";
		String actualLName=s.getLastName();
	    assertEquals(expectedLName, actualLName);	
	  }
/* проверка что правильно выводится полное имя "Фамилия Имя" */
	
	@Tag ("Negative")
	@Test
	void testN2() {
		String name="аННа";
		s.setFirstName(name);
		String lname="сиДОРОва";
		s.setLastName(lname);
		String expectedFullName="Сидорова Анна";
		String actualFullName=s.getFullName();
		assertEquals(expectedFullName, actualFullName);	
	  }

/* проверка что правильно выводится Имя" */	  
	
	  @Tag ("Positive")
	  @Test 
	  void testP1_1() {
		  String name="Sergey";
		  s.setFirstName(name);
		  String expectedName="Sergey";
		  String actualName=s.getFirstName();
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
	    assertEquals(expectedName, actualName);
	   }

/* проверка что правильно выводится фамилия" */	
	  
	  @Tag ("Positive")
	  @Test 
	  void testP1_2() {
		  String name="Тупиков";
		  s.setLastName(name);
		  String expectedLName="Тупиков";
		  String actualLName=s.getLastName();
	    assertEquals(expectedLName, actualLName);
	   }

/* проверка что правильно выводится полное имя "Фамилия Имя" на английском*/	  
	  
	    @Tag ("Positive")
		@Test
		void testP3() {
			String name="Sergey";
			s.setFirstName(name);
			String lname="Tupikov";
			s.setLastName(lname);
			String expectedFullName="Tupikov Sergey";
			String actualFullName=s.getFullName();
			assertEquals(expectedFullName, actualFullName);	
	    }	  
	  
	  
	  
}