package interviewQuestionPractice;

import utility.StringProgramPractice;

public class StringBasic {

	public static void main(String[] args)
	{
		String str="My name is Pawan Kumar Shakya";
		String strOne="pawan";
		StringProgramPractice myPractice=new StringProgramPractice();
	    System.out.println(myPractice.countNumOfCharacter(str));
	    myPractice.countNumOfConsonentAndVowels(str);
	    myPractice.checkAngrumString(str, strOne);
	    myPractice.equalPartOfString(strOne, 3);
	    myPractice.findAllSubString(strOne);
	}	

}
