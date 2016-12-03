 package encapsulation;

public class FinalTest {

	public static void main(String[] args) {
		
		Student_info student_info = new Student_info();
		student_info.setStudentId(101);
		student_info.setStudentFirstName("John");
		student_info.setStudentLastName("Doe");
		student_info.setStudentDepartment("IT");
		
		System.out.println("Student's Id:" + student_info.getStudentId()+ " " + "Student's First Name:"+ student_info.getStudentFirstName()
		+ " "+ "Student's Last Name" + student_info.getStudentLastName()+" "+ "And Student's Department Name" + student_info.getStudentDepartment());
		
		
		}

}


