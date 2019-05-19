package OopsConceptsPractice;

public class TestStudent_thisDemo {
	public static void main(String args[])
	{  
		Address_thisDemo myadress=new Address_thisDemo("pune", "India");
		Student_thisKeywordDemo s1=new Student_thisKeywordDemo(1, "Pawan", "java", myadress);
		 // Student_thisKeywordDemo s1=myadress.getSudentWithAdress(1, "Pawan", "Java");
		  System.out.println("Rollno : "+s1.getRollno());
		  System.out.println("Name   : "+s1.getName());
		  System.out.println("Course : "+s1.getCourse());
//		  System.out.println("City   : "+s1.getAddress().getCity());
//		  System.out.println("Country: "+s1.getAddress().getCountry());
//		  System.out.println(s1.getAddress().getClass());
		  System.out.println("City   : "+s1.getAddress().getCity());
		  System.out.println("Country: "+s1.getAddress().getCountry());
		  System.out.println(s1.returnAll());
	}
}