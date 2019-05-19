package introduction;

public class StaticKeyDemo 
{
   static final int addNum=10; 
   static int sum(int num) 
   {
	   return(num+addNum);
   }
	public static void main(String[] args)
	{
		StaticKeyDemo s1 = new StaticKeyDemo();
		int sum = s1.sum(70);
		System.out.println("Sum is :"+sum);
		
//		StaticKeyDemo s2 = new StaticKeyDemo();
//		 sum =sum(80);
//		System.out.println("Sum is :"+sum);

	}

}
