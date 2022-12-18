package Encapsulation;

public class EmployData {
	
	
	private int Pin;
	private String Name;                         // decleration -->> globaly
	private  int Age;
	
	
	
	
	public static void main(String[] args) {
		
		EmployData Emp = new EmployData();
		Emp.setAge(25);
		Emp.setName("Viki");
		Emp.setPin(557);                                                // call from same class foe set method
	
	int a=	Emp.getAge();           System.out.println(a);
	String n= Emp.getName();        System.out.println(n);              // call from same class  for get method
	int p= Emp.getPin();            System.out.println(p);
		
	}

	 
	
	
	
	
	
	
	public int getPin() {                                         //getmethod
		return Pin;
	}

	public void setPin(int pin) {                                 //setmethod
		Pin = pin;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	

}
