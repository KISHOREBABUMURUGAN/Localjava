package classwork;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  nums;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the table number : ");
nums=sc.nextInt();
int result;

System.out.println("The "+nums+"is here : ");
   for(int i=1;i<=10;i++) {
	   result=nums*i;
	   System.out.println(" "+nums+" x "+i+" = "+result+"" ); 
   }
     
	}

}
