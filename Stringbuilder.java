package String;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StringBuilder s=new StringBuilder("KI@1ho%54EbabU");
  
  System.out.println(s);
  int uppercase=0,lowercase=0,space=0,numbers=0;
   for(int i=0;i<s.length()-1;i++) {
	    if(s.charAt(i)>=97 && s.charAt(i)<=122) {
	    	
	    	lowercase++;
	    }
  if(s.charAt(i)>=65 && s.charAt(i)<=90) {
	    	
	    	uppercase++;
	    }
  if(s.charAt(i)==32) {
  	
  	space++;
  }
  if(s.charAt(i)>=48 && s.charAt(i)<=57) {
  	
  	numbers++;
  }

	    
   }
   System.out.println("Lowercases"+lowercase);
   System.out.println("uppercases"+uppercase);
   System.out.println("space"+space);
   System.out.println("numbers"+numbers);
	}

}
