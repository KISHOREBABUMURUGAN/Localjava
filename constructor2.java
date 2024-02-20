package constructorchain;

public  class constructor2 extends constructor1 {

	
	      constructor2(){
	    	  super("kishore");  //super call only from child to parent
	    	  System.out.println("I am a default constructor2");
	    	  
	      }
	       constructor2(int a){
	    	   this();
	    	   System.out.println("6789");
	       }
	       constructor2(String a){
	    	   this(20);
	    	   
	    	   System.out.println("Murugan");
	       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         constructor2 obj=new constructor2("murugan");
	}

}
