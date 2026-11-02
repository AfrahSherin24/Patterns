package FirstProgram;

public class RightHalfPyramid {

	public static void main(String[] args) {
		
		for(int i = 1; i<=6; i++) {   //used for num of rows
			for(int j=1; j<=i; j++) {  // used to decide how many stars
				System.out.print(" * "); //j prints in same row coz we used print
			}
			System.out.println(); // i goes to next rown coz println
		}

	}

}
