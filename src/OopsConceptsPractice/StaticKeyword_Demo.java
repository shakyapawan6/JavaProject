package OopsConceptsPractice;

public class StaticKeyword_Demo {
 static int serialNumber=0;
  static String name;
  static public void upadeteSerialNumber(){
	  serialNumber=1;
  }
  public void display() {
	  System.out.println("S.no :  "+serialNumber+"  Name  : " +name);
  }
}
