package OopsConceptsPractice;

public class Address_thisDemo {
	String city;
	String country;
	Address_thisDemo(String city,String country){
		this.city=city;
		this.country=country;
	}
//	public Student_thisKeywordDemo getSudentWithAdress(int rollno,String name,String course) 
//	{
//		Student_thisKeywordDemo s=new Student_thisKeywordDemo(rollno, name, course, this);
//		return s;
//		
//	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
