package Encapsulation;

public class EMPDifferent_Class_Call {
	
	public static void main(String[] args) {
		
		
		EmployData emp = new EmployData();
		
		emp.setAge(24);
		emp.setName("vinayak");
		emp.setPin(557);		
	
		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getPin());
		
		
		
		
	}

}
