package introduction;

import java.util.Scanner;

public class ReverseStringDemo 
{
   
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String newString;
		System.out.println("enter the String :");
		newString=scan.nextLine();
		while (newString.isEmpty()||newString==null) 
		{
			System.out.println("Please enter valid String , Null or Empty String not accepted");
		    newString=scan.nextLine();
		}
		scan.close();
		String output=ReverseStringDemo.revCharcter(newString);
        System.out.println(output);
      
	}
public static String revCharcter(String newString)
   {
	String reverse="";
	for(int i = newString.length()-1; i>=0; i--) 
	{
		   newString=newString + newString.charAt(i);	
	}
    return reverse;	   
   }
}
