package day37_inheritence;

public class Employee extends Person {

String jobTitle;

public void work() {
	System.out.println(name +" is working "+ jobTitle);
}

@Override
public String toString() {
	return "Employee [jobTitle=" + jobTitle + ", name=" + 
name + ", age=" + age + ", gender=" + gender + "]";
}
	
	
	
}
