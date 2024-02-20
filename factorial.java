package capgeminibasicsjava;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
nums=sc.nextInt();
int f=1;
for(int i=1;i<=nums;i++) {
	f=f*i;
	
}
System.out.println("factorial :"+f);
	}

}
