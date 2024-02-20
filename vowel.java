package classwork;
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name : ");
Name=sc.next().toLowerCase();
System.out.println(Name);
  for(int i=0;i<=Name.length()-1;i++) {
	  if(Name.charAt(i)=='A'||Name.charAt(i)=='E'||Name.charAt(i)=='I'||Name.charAt(i)=='O'||Name.charAt(i)=='U'||Name.charAt(i)=='a'||Name.charAt(i)=='e'||Name.charAt(i)=='i'||Name.charAt(i)=='o'||Name.charAt(i)=='u') {
		  System.out.println(Name.charAt(i));
	  }
  }
	}

}
