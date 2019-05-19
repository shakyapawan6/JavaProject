package utility;

public class StringProgramPractice {
	// method to count total number of character
	int count = 0;
	int i, j;

	public int countNumOfCharacter(String str) {
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;
	}

	public void countNumOfConsonentAndVowels(String str) {
		int vCount = 0, cCount = 0;
		// Converting entire string to lower case to reduce the comparisons
		str = str.toLowerCase();

		for (i = 0; i < str.length(); i++) {
			// Checks whether a character is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// Increments the vowel counter
				vCount++;
			}
			// Checks whether a character is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				// Increments the consonant counter
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

	public void checkAngrumString(String str1, String str2) {
		boolean anagrum = false;
		for (i = 0; i < str1.length(); ++i) {
			for (j = 0; j < str2.length(); ++j) {
				if (str1.charAt(i) == str2.charAt(j))
					anagrum = true;
			}
		}
		if (anagrum == true)
			System.out.println("Strings are Anagrum");
		else
			System.out.println("Strings are not anagrum");
	}

	public void equalPartOfString(String str, int num) {
		int n = num;
		int chars = str.length() / n;
		String[] equalStr = new String[n];
		int temp = 0;
		if (str.length() % n != 0) {
			System.out.println("String can not divide into equal parts");
		} else {
			for (i = 0; i < str.length(); i = i + chars) {
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " Equals parts of String are ");
			for (i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

	public void findAllSubString(String str) {
		int temp=0;
		int len=str.length();
		String [] possibleString=new String[len*(len+1/2)];
		for(i=0;i<len;++i) 
		{
			for(j=i;j<len;j++) 
			{
				possibleString[temp]=str.substring(i, j+1);
				temp++;
			}		
		}
		System.out.println("possible sub String are : "+temp);
		for(i=0;i<temp;i++) {
			System.out.println(possibleString[i]);
		}

	}
}
