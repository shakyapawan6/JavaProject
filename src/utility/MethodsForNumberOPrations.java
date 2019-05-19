package utility;

public class MethodsForNumberOPrations {
	// method to find factorial of N number using for loop
	public void myFacctorialCalculation(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;
		System.out.println(fact);
	}

	// method to find sum of N natural number
	public void mySumOfNaturalNum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		System.out.println(sum);
	}

	// method to find fibonacci Series using while loop
	public void myFibonacciSeriesCalculationUsingWhile(int num) {
		int i;
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for (i = 0; i < num; i++) {
			System.out.println(sum + " + ");
			sum = num1 + num2; // 0 + 1 + 1 + 2 + 3 + 5 +
			num1 = num2;
			num2 = sum;
		}
	}

	// method to check prime number
	public void myPrimeNumberCheck(int num) {
		int i;
		if (num < 4)
			System.out.println(num + " is a prime number");
		else {
			for (i = 1; i < num / 2; i++) {
				if (i % num == 0)
					System.out.println(num + " is not a Prime number");
				else
					System.out.println(num + " is a prime number");
			}
		}
	}

	// method to check number is Palindrome or not Ex. 393 is palindrom
	public void myPalindromeCheck(int num) {
		int temp;
		int r;
		temp = num;
		int sum = 0;
		while (num > 1) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a Palindrom Number");
		else
			System.out.println(temp + " is not a Palindrom Number");

	}
    // method to check Armstrong number check  Ex. 
	public void myArmstrongNumberCheck(int num) {
		int temp = num;
		int r;
		int sum = 0;
		while(num>0) {
			r=num%10;
			sum=(r*r*r)+sum;
			num=num/10;
		}
		
		if (temp==sum)
			System.out.println(temp+" is a Armstrong Number");
		else 
			System.out.println(temp+" is not a Armstrong Number");
		
	}

}
