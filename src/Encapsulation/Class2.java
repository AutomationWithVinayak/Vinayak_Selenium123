package Encapsulation;

public class Class2 {

	
	public static void main(String[] args) {
		
		Class1 data = new Class1();
		data.setA("Vicky");
		data.setB("Vinayak");
		data.setC(100);
		data.setD(98.99);
		data.setE(true);
		data.setF('A');
        data.setG((short) 10);		
        
     System.out.println(data.getA()); System.out.println(data.getB());  System.out.println(data.getC());  System.out.println(data.getD());
     System.out.println(data.getF()); System.out.println(data.getE());  System.out.println(data.getG());
        
        
        
        
        
        
	}
}
