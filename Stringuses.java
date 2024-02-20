package capgeminibasicsjava;

import java.util.Scanner;

public class Stringuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a name : ");
		name=sc.next().toLowerCase();
		
		if(name.equals("kishore")) {
			System.out.println("yeah! its kisore");
		}
		
		
		else {
			System.out.println("Invalid input");
		}
	}

}
