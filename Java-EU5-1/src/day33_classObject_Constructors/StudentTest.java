package day33_classObject_Constructors;

public class StudentTest {

	public static void main(String[] args) {

		Student s1=new Student("Mike", 17, 'M', 2017, "Java");
		Student s2= new Student("Smith", 25, 'M', 1999, "TS");
		
		s1.attendLecture();
		s2.attendLab();
		s1.submitAssignment();
		System.out.println(s2.toString());
	}

	
	
}
