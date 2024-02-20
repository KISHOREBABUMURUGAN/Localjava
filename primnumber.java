package capgeminibasicsjava;

import java.util.Scanner;

public class primnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number : ");
		nums=sc.nextInt();
		int count=0;
		for(int i=1;i<=nums;i++) {
			if(nums%i==0) {
				count++;
			}
		
		}
		if(count==2) {
			System.out.println(nums+" : is a prime number ");
		}
		else {
			System.out.println(nums+" : is not a prime number");
		}
	}

}
