
import java.util.Scanner;

class Guess {
  public static void main(String[] args) {

	int x = (int) (Math.random()*100 + 1); 
	
	Scanner U = new Scanner (System.in);
	System.out.print("Guess X ");
	int g = U.nextInt();

	while(true){
	  if(x==g) {
	    System.out.println("X = " + g + " Congratulations!");
	    return;
	  }
	  if(g > x) System.out.println("X < " + g);
	  else if(g < x) System.out.println("X > " + g);
	  
	  System.out.print("Guess X ");
	  g = U.nextInt();
	  

	  
  }
 }
}
