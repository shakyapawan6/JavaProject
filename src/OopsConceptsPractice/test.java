package OopsConceptsPractice;

public class test {

	
public void demo() throws Exception
{
	throw new Exception("hello");
}
	public static void main(String[] args) {
		
test t=new test();
try {
	t.demo();
} catch (Exception e) {
	
	e.printStackTrace();
}
	}

}
