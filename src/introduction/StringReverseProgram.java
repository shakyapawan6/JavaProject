package introduction;

public class StringReverseProgram {

	public static void main(String[] args) 
	{
		String input="This is a test String";
		String output=revString(input); 
		//String output1=revcharc(input); 
		System.out.println("String input :"+input);
		System.out.println("String output :"+output);// #output String test a is This
		//System.out.println("chacter reverse output is : "+output1); // # output siht si a tset gnirts
	}
	public static String revString(String input)
	{
		String reverse=" ";
		if(input.length()==1)
		{
			reverse=input;
		}
		else
		{
			String[] orginalArray=input.split("\\s+");
			for(String item :orginalArray)
				reverse=item+" "+reverse;
		}
		return reverse.trim();
		
	}
//	public static String revcharc(String input)
//	{
//		String reverse =" ";
//			for (int i=input.length();i>=0;i--)
//				reverse+=input.charAt(i);	
//		return reverse;
//	}
//	
}
