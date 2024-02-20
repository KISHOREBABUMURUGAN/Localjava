package classwork;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		nums=sc.nextInt();
		
		int reverse=0,rem;
		
		while(nums!=0)
		{
			
		rem=nums%10;
		reverse=(reverse*10)+rem;
		nums=nums/10;
		}
		System.out.println("palindrome number is :"+reverse);
		}

}
