package interviewQuestionPractice;

import java.util.Scanner;

public class NumberPattern1 {
	 

	public static void main(String[] args) {
		
		System.out.println("Enter row numbers which you want to print : ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for (int i = 0; i < num; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);	
			}
				System.out.println("\n");
		}
		scan.close();			
	}
}

/* If user print i
Enter row numbers which you want to print : 
5


1

12

123

1234

 */

/* If user print in
 * Enter row numbers which you want to print : 
5


1

22

333

4444

 */

