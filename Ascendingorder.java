package capgeminibasicsjava;
import java.util.Arrays;
import java.util.Scanner;
public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the number limit : ");
a=sc.nextInt();
int nums[]=new int[a];

for(int i=0;i<a;i++) {
	System.out.print("Enter the "+i+" number : ");

	nums[i]=sc.nextInt();
}

   int temp;
   
     for(int j=0;j<=nums.length-1;j++) {
    	 for(int k=j+1;k<=nums.length-1;k++) {
    		 if(nums[j]<nums[k]) {
    			 temp=nums[j];
    			 nums[j]=nums[k];
    			 nums[k]=temp;
    		 }
    	 }
    	
     }
     System.out.println(Arrays.toString(nums));
	}

}
