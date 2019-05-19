package OopsConceptsPractice;

public class TestStatic_Demo {
     int rollno;
	public static void main(String[] args) {
		TestStatic_Demo demo=new TestStatic_Demo();
		demo.rollno;
		StaticKeyword_Demo staticDemo=new StaticKeyword_Demo();
		StaticKeyword_Demo.name="pawan";
		staticDemo.display();
		StaticKeyword_Demo.name="Kirti";
		staticDemo.display();
	}

}
