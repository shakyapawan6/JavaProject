package introduction;

public class ArrayDemo {

	public static void main(String[] args) {
	 int[] myintarray1;// Reference to array
	 int p=89;
	 int[] myintarray2=new int[10];// array is created now
	 for (int i=0;i<myintarray2.length;i++) {
		 myintarray2[i]=p;
		 p++;
	 }
     System.out.println(myintarray2);
	}

}
