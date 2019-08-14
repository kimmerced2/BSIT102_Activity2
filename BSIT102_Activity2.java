import java.util.Scanner;
public class BSIT102_Activity2 {

    public static void main(String [] args) {
    	String name, course, section, address, contactnumber;
    	Scanner kim = new Scanner(System.in);
    	
    	System.out.println("Name");
    	name = kim.nextLine();
    	System.out.println("Course");
    	course = kim.nextLine();
    	System.out.println("Section");
    	section = kim.nextLine();
    	System.out.println("address");
    	address = kim.nextLine();
    	System.out.println("Contactnumber");
    	contactnumber = kim.nextLine();
    	
    	System.out.println("Name" + name);
    	System.out.println("Course" + course);
    	System.out.println("Section" + section);
    	System.out.println("Address" + address);
    	System.out.println("Contactnumber" + contactnumber);
    
    }
    
    
}