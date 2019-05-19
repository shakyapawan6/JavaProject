package introduction;

public class CarDemo {

	public static void main(String[] args) 
	{
		Car bmw = new Car();
		bmw.setColor("Red");
		System.out.println(bmw.getColor());
		bmw.setYear(2019);
		System.out.println(bmw.getYear());
	}

}
