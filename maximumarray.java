package exam;

public class maximumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,5,6,9,12,11};

       for(int i=0;i<a.length;i++) {
    	   for(int j=i+1; j<a.length;j++) {
    		   if(a[i]>a[j]) {
    			   System.out.println(a[i]);
    		   }
    	   }
       }
	}

}
