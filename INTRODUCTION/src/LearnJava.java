


public class LearnJava {

	public static void main(String[] args) {
		
		
		System.out.println(myString());
		System.out.println(isAzamatHandsome());
		System.out.println(myGrade());
		isNumberIsTrue();
		
		
		
		
		/*String test = "Azamat";
		Boolean isAzamatHandsome = false;
		int     yourGrade = 5;
		
		System.out.println(test);
		System.out.println(isAzamatHandsome);
		System.out.println(yourGrade);*/
		
	
		
		
		
		
		
	}
	
	public static String myString () {
		String test = "Azamat ";
		return test;
	}
	
	public static boolean isAzamatHandsome() {
	  boolean test_1 = true;
		return test_1;
		
	}
	
	public static int myGrade ( ) {
		
	 int test_2 = 54;
		return test_2;
	}
	
	public static void isNumberIsTrue() {
		
		//int myNum = 0;
		
		for ( int myNum = -3; myNum < 45; myNum ++) {
			
			if(myNum == 21) {
				break;
			}
			
			System.out.println(myNum); 
			
			
			
		}
		
		
	}

}





/*         
 * We have data types 
 * 1 bytes   >> Numbers
 * 2 Shorts  >> Numbers
 * 3 Long    >> Numbers
 * 4 double  >> Numbers
 * 5 Floats  >> Numbers
 * 3 Integer >> Numbers
 * 
 * 1 Char    >> Accepts one character 
 * 2 String  >> Accepts combination of letters 
 * 3 Boolean >> True or False
 *  
 * 
 * 
 */
