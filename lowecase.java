package classwork;
import java.util.Scanner;
public class lowecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
Scanner sc=new Scanner (System.in);
System.out.println("Enter a name : ");
s=sc.next();
String lowercase=s.toLowerCase();

   for(int i=0;i<s.length();i++) {
	   if(s.charAt(i)==lowercase.charAt(i)) {
		   System.out.println(s.charAt(i));
	   }
   }

	}

}
