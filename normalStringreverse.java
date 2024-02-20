package String;
import java.util.Scanner;
public class normalStringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
String name;
System.out.println("Enter  a name :");
name=sc.next();
for(int i=name.length()-1;i>=0;i--) {
	
	System.out.print(name.charAt(i));
}

	}

}
