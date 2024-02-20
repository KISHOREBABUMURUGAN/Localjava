package capgeminibasicsjava;
import java.util.Scanner;
public class Questionnumber14multipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the multiplication table : ");
nums=sc.nextInt();
int table;
   for(int i=0;i<=nums;i++) {
	   table=nums*i;
	   System.out.println(nums+"*"+i+"="+table);
   }
      
	}

}
