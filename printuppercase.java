package classwork;

import java.util.Scanner;

public class printuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a name : ");
		s=sc.next();
String		uppercase=s.toUpperCase();

		   for(int i=0;i<s.length()-1;i++) {
			   if(s.charAt(i)==uppercase.charAt(i)) {
				   System.out.print(s.charAt(i));
			   }
		   }
	}

}
