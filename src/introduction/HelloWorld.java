package introduction;

public class HelloWorld {

	public static void main(String[] args)
	{
		System.out.println("Hellow Java");
		char grade=calGrade(80);
		displayGrade("Pawan", grade);
		grade=calGrade(65);
		displayGrade("Nick", grade);
		displayGrade("Tom", calGrade(40));
	  
	}
	public static char calGrade(int score) {
		char grade;
		if (score>=80)
			grade='A';
		else if ((score >=60)&&(score <80))
			grade='B';
		else if ((score >=45)&&(score <60))
			grade='C';
		else
			grade='D';
		return grade;			
	}
	public static void displayGrade(String name,char grade) 
	{
		System.out.println("*****************************");
		System.out.println("Grade of "+name+" is : "+grade);
		System.out.println(".............................");
	}

}
