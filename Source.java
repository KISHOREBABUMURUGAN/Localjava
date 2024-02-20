package String;

public class Source {
	
  public static int distance(StringBuilder w, StringBuilder w1) {
	  StringBuilder s=w;
		StringBuilder s1=w1;
		
		s.replace(0, 1, "r");
		System.out.println(s);
		s.delete(2,3); //starting index, letter
		System.out.println(s);
		s.delete(3,4);
		System.out.println(s);
		return s.length();

	//System.out.println(s.length());
		
		    
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source sc=new Source();
		 StringBuilder s = new StringBuilder("horse");
		  StringBuilder s1 = new StringBuilder("ros");
		  sc.distance(s, s1);
		  System.out.println(s.length());
		
		  

  
 
	}

}
