package online_tusur.unit_online_tusur;
import online_tusur.unit_online_tusur.Student;

import java.util.Arrays;


public class Main {

	//главный метод класса
		public static void main(String[] args) {
			// s1, s2, s3 - объекты класса Student
/*			Student s1 = new Student();
			s1.setFirstName("g");
			s1.setLastName("h");
			s1.setAge(42);
*/					
			Student s1 = new Student("Сергей","Тупиков",42);
			Student s2 = new Student("cветлана","ИвАнова",15);
			Student s3 = new Student("аННа","сиДОРОва",55);
			Student s4 = new Student("я","",18);
			Student s5 = new Student("","ю",50);
			Student s6 = new Student("Анна-Виктория","петров-водкин",0);
			Student s7 = new Student("Пабло Диего Хосе Франциско де Паула Хуан Непомукено Криспин Криспиано де ла Сантисима Тринидад Руиз","Толлмаш-Толлмаш де Ореллана-Плантагенет-Толлмаш-Толлмаш",-5);
			Student s8 = new Student("sergey","tuPIKov",20);
			Student s9 = new Student("Ivan","petrov",1);
			Student s10 = new Student("Пабло Диего Хосе Франциско де Паула Хуан Непомукено Криспин Криспиано де ла Сантисима Тринидад Руиз","Толлмаш-Толлмаш де Ореллана-Плантагенет-Толлмаш-Толлмаш",25);
			Student s11 = new Student("Sergey","Tupikov",20);
			Student s12 = new Student("Ар2р","Ba2t_off",25);

			
			System.out.println(s1.getFullName() + ", " + s1.getAge());
			System.out.println(s2.getFullName() + ", " + s2.getAge());
			System.out.println(s3.getFullName() + ", " + s3.getAge());
			System.out.println(s4.getFullName() + ", " + s4.getAge());
			System.out.println(s5.getFullName() + ", " + s5.getAge());
			System.out.println(s6.getFullName() + ", " + s6.getAge());
			System.out.println(s7.getFullName() + ", " + s7.getAge());
			System.out.println(s8.getFullName() + ", " + s8.getAge());
			System.out.println(s9.getFullName() + ", " + s9.getAge());
			System.out.println(s10.getFullName() + ", " + s10.getAge());
			System.out.println(s11.getFullName() + ", " + s11.getAge());
			System.out.println(s12.getFullName() + ", " + s12.getAge());

		
/*				System.out.println(s3.getFullName() + ", " + s3.getAge());
			
			

			Student[] students = { s1,s2,s3};
		    Student[] students2 = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
						new Student("Aleksey", "Alekseev", 35)};
			
			System.out.println("AVG= "+Student.avgAge(students2));
			System.out.println("MAX= "+Student.maxAge(students));
			System.out.println("MIN= "+Student.minAge(students));
*/			
			
		   
		}

}
