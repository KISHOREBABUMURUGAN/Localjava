package capgeminibasicsjava;

import java.util.Scanner;

public class fibonacizeries {
public static  void main (String []args) {
	// TODO Auto-generated method stub
	int nums;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	nums=sc.nextInt();
	//0 1 1 2 3 5 8 13
	int a=-1,b=1,c;
	
	for(int i=1;i<=nums;i++) {
		c=a+b;//0
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
