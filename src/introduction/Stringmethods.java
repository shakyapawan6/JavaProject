package introduction;

public class Stringmethods {

	public static void main(String[] args) 
	{
		String str="This is the test String   ";
		String str1="hello I am okk";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.concat(str));
		System.out.println(str.contains("ikk"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.endsWith("String"));
		System.out.println(str.equals(str1));
		System.out.println(str.indexOf("the"));// return -1 if not exist , take argument as character if we pass string then it will give index of first chacter  
        System.out.println(str.isEmpty()); // return true or false , don't take argument 
	    System.out.println(str.trim());// remove the spaces from the leading and trailing spaces 
	    System.out.println(str.replace('s','v'));// this is replace the old charachter by new character , it will trow eror if you try to replace string in place of string
	    System.out.println(str.substring(3, 5));// give the substing from the given index to end index , last index is excluding 
	    char[] chararry=str.toCharArray();
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(chararry[i]);
	    }
	   System.out.println(str.toLowerCase());
	   System.out.println(str.toUpperCase());
	   
	}

}
