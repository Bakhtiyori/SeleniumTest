import java.util.Scanner;

public class MyGrade {

	public static void main(String[] args) {
		
		studentGrade();
		dontBeLate();
		guessMyName(); 
		
		
	}
	
	private static void studentGrade() { 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		

		int newInput = input.nextInt();
		
		if (newInput >= 90 && newInput <= 100) {
			String x =  "\uD83E\uDD2B";
			System.out.println(x);
			
		}else if ( newInput >= 80 && newInput <= 90) {
			
			String A =  "\uD83E\uDD2B";
			System.out.println( A ) ;
			
			
		}else {
			
			String y =  "\uD83D\uDE14";
			System.out.println( y ) ;
			
		}
		
	}
	
	
	private static void dontBeLate() {
		
		Scanner azamat = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		int bizhan = azamat.nextInt();
		
		if (bizhan >= 10 && bizhan <= 11) {
			System.out.println("You are on time" );
			
		}else if ( bizhan >= 12 && bizhan <= 1) {
			System.out.println("This your last note");
			
		}else {
			System.out.println("Go home" + "\uD83E\uDD2C "  + "\uD83E\uDD2C " + "\uD83E\uDD2C " );
		}
		
	}
	
	private static void guessMyName() {
		
		String name = "Putin";
		
		Scanner nargis = new Scanner(System.in);
		
		System.out.println("Please enter a name ");
		
		String test = nargis.nextLine();
		
		
		if (test.equals(name)) {
			System.out.println("Good job, you guessed the name " + name);
			
		}else{
			System.out.println("Incorrect Name ");
			
		}
		
		
		
	}
	

}
