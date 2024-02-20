package capgeminibasicsjava;
import java.util.Scanner;
public class Greaternumberoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		
		int a,b,c,d,e,f,g,h,i;
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
System.out.println("Enter the first number :");
 a=sc.nextInt();
System.out.println("Enter the second number : ");
 b=sc.nextInt();
 c=b-a;

System.out.println("Enter the next  two numbers");
System.out.println("Enter the first number :");
 d=sc.nextInt();
System.out.println("Enter the second number : ");
 e=sc.nextInt();
 f=e-d;

System.out.println("Enter the another  two numbers");
System.out.println("Enter the first number :");
 g=sc.nextInt();
System.out.println("Enter the second number : ");
 h=sc.nextInt();
i=h-g;

if(c>f && c>i) {
	System.out.println(a+","+b+" number has major difference, "+"The difference is : "+c);
	
}
if(f>c && f>i) {
	System.out.println(d+","+e+" number has major difference, "+"The difference is : "+f);
}
if(i>c && i>f) {
	System.out.println(g+","+h+" number has major difference, "+"The difference is : "+i);
}
		
	}

}
