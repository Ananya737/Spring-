package DI;

class Address{
	String pincode;
	String city;
	
	 public Address(String pincode,String city) {
		 this.pincode=pincode;
		 this.city=city;
	 }
	int display() {
		System.out.println(pincode + " "+ city);
		return 0;
	}
}


public class Student {
	
	
	
 int roll;
 String name;
 Address address; 
 
 public Student() {
	 address=new Address("12345","Bangalore");
}
 
 int getValue() {
	 return address.display();
 }
 
 public static void main(String[] args) {
	Student obj = new Student();
	System.out.println(obj.getValue());
}
}
