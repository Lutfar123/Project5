package abstraction;

public abstract class professor implements collegedepartment {
	



	public void mathDept() {
		System.out.println("MathDepartment has 40 students");
		
	}

	
	public void businessDept() {
		 System.out.println("BusinessDepartment has 50 students");
		
	}
	   
	
	public abstract void mathProfessor();
	public abstract void businessProfessor();
	

	
	

}
