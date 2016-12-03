package encapsulation;

public class Student_info {
	
	private int StudentID;
	private String StudentFirstName;
	private String StudentLastName;
	private String StudentDepartment;
	
	public int getStudentId(){
		return StudentID;
	}
	
	public void setStudentId(int StudentID){
		this.StudentID = StudentID;
	}
	
	public String getStudentFirstName(){
		return StudentFirstName;
	}
	
	public void setStudentFirstName(String StudentFirstName){
		this.StudentFirstName = StudentFirstName;
	}
	
	public String getStudentLastName(){
		return StudentLastName;
	}
	
	public void setStudentLastName(String StudentLastName){
		this.StudentLastName= StudentLastName;
	}
	
	public String getStudentDepartment(){
		return StudentDepartment;
	}
	
	public void setStudentDepartment(String StudentDepartment){
		this.StudentDepartment = StudentDepartment;
	}
}
	
