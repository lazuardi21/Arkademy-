5.A untuk fibo Genap saya menggunakan JAVA
import java.util.Scanner;

class Main {
    	public static void main(String[] args) {
		    
				Scanner data = new Scanner(System.in);
				System.out.println( " masukkan nilai n: ");
				 int limit = data.nextInt(); 
				 System.out.println(evenFibSum(limit)); 
		}
	static int a = 2; 
	static int evenFibSum(int limit) 
    { 
        if (limit < 2) 
            return 0; 
        long ef1 = 0, ef2 = 2; 
        long sum = ef1 + ef2; 

        while (ef2 <= limit) 
        { 
          
            long ef3 = 4 * ef2 + ef1; 
      
          
            if (ef3 > limit) 
                break; 
      
         
            ef1 = ef2; 
            ef2 = ef3; 
            sum += ef2; 
        } 
      
        return(int) sum; 
    } 
	
		}
    
    5.b Untuk Fibo Ganjil
    
    import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		
				Scanner data = new Scanner(System.in);
				System.out.println( " masukkan nilai n: ");
			
			        int Fibcnt = data.nextInt();
			        int[] feb = new int[Fibcnt];
			        feb[0] = 0;
			        feb[1] = 1;
			        for (int i = 2; i < Fibcnt; i++) {
			            feb[i] = feb[i - 1] + feb[i - 2];
			        }

			        int a = 0;

			        for (int i = 0; i < feb.length; i++) {
			            if (feb[i] % 2 == 1) {
			                a += feb[i];
			                System.out.print(feb[i] + " ");
			            }
			        }
			        System.out.println();
			        System.out.println("Total angka ganjil: " + a);
			    }
			}
