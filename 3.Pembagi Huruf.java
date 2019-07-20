import java.util.Scanner;

class Main {
    public static char[] ourToCharArrayFunction(String str) {
	        char[] result = new char[str.length()];
	        for (int i=0; i<str.length(); i++) {
	            result[i] = str.charAt(i);
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	    	Scanner reader = new Scanner(System.in);
	    	System.out.println("masukkan kata yang diinginkan:");
	    	String a = reader.next();
	    	int b=0;
	        char[] charArray = ourToCharArrayFunction(a);
	        
	        if (b<2) {
	        	System.out.print(charArray[b]);
		        b++;
		        System.out.print(charArray[b]);
		        b++;
		        System.out.println(charArray[b]);
		        b++;
			
	         if (b>2 && b<7) {
	        	System.out.print(charArray[b]);
		        b++;
		        System.out.print(charArray[b]);
		        b++;
		        System.out.print(charArray[b]);
		        b++;
		        System.out.println(charArray[b]);
		        b++;
			}
	         for ( ; b < charArray.length; b++) {
		            System.out.print(charArray[b]);
			    
			    		
				}
	        }
	       
	    }
	}
	
