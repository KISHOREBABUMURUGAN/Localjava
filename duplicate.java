package classwork;
import java.util.Scanner;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  limit;
	
		
Scanner sc=new Scanner (System.in);
System.out.println("Enter the limit : ");
limit=sc.nextInt();
int a[]=new int [limit];
for(int i=1;i<=limit-1;i++){
	System.out.println("Enter the "+i+" number");
	a[i]=sc.nextInt();
}
for(int b=0;b<=limit-1;b++) {
	for(int c=b+1;c<=limit-1;c++) {
		if(a[b]==a[c]) {
			System.out.println(a[c]);
		}
	}
}
	}

}
