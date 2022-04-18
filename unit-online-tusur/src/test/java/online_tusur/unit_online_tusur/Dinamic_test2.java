package online_tusur.unit_online_tusur;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
//import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Dinamic_test2 {
	@Factory 
	public Object[] testFactory() {
	return new Object[] {new ageStudents()};	
	}
}	

class ageStudents{
	Student[] students = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
			new Student("Aleksey", "Alekseev", 35), new Student("Oleg", "СидороВ", 35)};
  
@DataProvider (name="dataAgeStud")
  public Object[][] ageStudentsData ()  {
	  return new Object[][] {{20, students}, {18,students},
		  {35,students},{27,students}};
	     }
  

@Test(dataProvider="dataAgeStud")
	public void test1 (int ageStudentsData, Student [] students) {
		assertEquals(ageStudentsData, Student.avgAge(students));
	}
}
