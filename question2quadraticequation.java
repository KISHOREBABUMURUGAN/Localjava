package capgeminibasicsjava;
import java.util.Scanner;
public class question2quadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the position a :");
a=sc.nextInt();
System.out.println("Enter the position b :");
b=sc.nextInt();
System.out.println("Enter the position c :");
c=sc.nextInt();
  double result= b*b -4.0*a*c;
  
  if(result>0.0) {
	  double num1= (-b +Math.pow(result, 0.5))/2*a;
	  double num2= (-b -Math.pow(result, 0.5))/2*a;
	  
	  System.out.println("The roots are : "+num1);
	  System.out.println("The roots are : "+num2);
  }
  else if(result==0.0) {
	  double num3=-b /(2.0*a);
	  System.out.println("The root are"+num3);
  }
  else {
	  System.out.println("The equation has no real roots.");
  }
	}

}
