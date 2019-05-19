package interviewQuestionPractice;

import java.util.Scanner;

import utility.MethodsForNumberOPrations;

public class NumberProblem {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num = scan.nextInt();
		MethodsForNumberOPrations numMethods = new MethodsForNumberOPrations();
		numMethods.myArmstrongNumberCheck(num);
		scan.close();
	}
}
