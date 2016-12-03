package abstraction;

public class student extends professor implements collegedepartment {
	
	
	
@Override	
public void mathDept() {
	System.out.println("MathDepartment has 40 students");
	
}
@Override
public void businessDept() {
	System.out.println("BusinessDept has 50 students");
	
}
@Override
public void mathProfessor() {
	System.out.println("Professor maintain 40 students");
	
}
@Override
public void businessProfessor() {
	System.out.println("Professor maintain 50 students");
	
}
public static void scienceDept() {
	System.out.println("Sciencedept has 60 students");
	
}
}
       

