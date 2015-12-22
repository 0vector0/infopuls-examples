package course01.prj10;
 
public class Group {
	Student []groupJava;
	Group(int numStudent){
		groupJava=new Student[numStudent];
	}
	void inputData(){
		 for (int i = 0; i < groupJava.length; i++) {
			 groupJava[i]=new Student();
		}
	}
	void exam(){
		 for (int i = 0; i < groupJava.length; i++) {
	    	 for (int j = 0; j < groupJava[i].getMarks(); j++) {
				groupJava[i].setMark((int)(Math.random()*3)+3, j);
			}		 
		}
	}
	void print(){
		for (int i = 0; i < groupJava.length; i++) {
			groupJava[i].print();
		}
	}
	static int myCompareTo(String aaa, String bbb){
	      int correctLength;
	      if(aaa.length()<bbb.length())correctLength=aaa.length();
	      else correctLength=bbb.length();
	      boolean findBigger=false;
	      for (int i = 0; i < correctLength; i++) {
	    	  if(aaa.charAt(i)>bbb.charAt(i)){
	    		  System.out.println("aaa bigger in "+aaa.charAt(i));
	    		  findBigger=true;
	    		  return 1;
	    		  }
	    	  else 
	    		  if(aaa.charAt(i)<bbb.charAt(i)){
	        		  System.out.println("bbb bigger in "+aaa.charAt(i));
	        		  findBigger=true;
	        		  return -1;
	        		  }
	    		  else System.out.println("equal - "+aaa.charAt(i));
 
		//	System.out.println();
		}
	      if(!findBigger){
	       if(aaa.length()<bbb.length()) {
	    	   System.out.println("bbb bigger length");
	    	   return -1;}
 
	       else 
	    	  if (aaa.length()>bbb.length()) {
	    	   System.out.println("aaa bigger length");
	    	   return 1;}
	          else 
	        	  System.out.println("equal string");
 
 
	      }
	      return 0;
	      }
 
	void sort(){
		for (int i = 0; i < groupJava.length; i++) {
			for (int j = 0; j < groupJava.length-i-1; j++) {
				if(myCompareTo(groupJava[j].getFio(),groupJava[j+1].getFio())==1){
					Student temp=groupJava[j];
					groupJava[j]=groupJava[j+1];
					groupJava[j+1]=temp;
				}
			}
		}
 
	}
}
 