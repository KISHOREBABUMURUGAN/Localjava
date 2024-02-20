package capgeminibasicsjava;
import java.util.Scanner;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int num1,num2,num3;

System.out.println("Enter the first number : ");
num1=sc.nextInt();
System.out.println("Enter the Second number :");
num2=sc.nextInt();
System.out.println("Enter the Third number :");
num3=sc.nextInt();
  if((num1>num2)||(num1>num3)) {
	  System.out.println("The greatest number is : "+num1);
  }
  else if((num2<num1)||(num2>num3)) {
	  System.out.println("The greatest number is : "+num2);
  }
  else if((num3>num1)||(num3<num2)) {
	  System.out.println("The greatest number is :"+num3);
  }
	}

}
