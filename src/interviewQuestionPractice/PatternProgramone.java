package interviewQuestionPractice;

public class PatternProgramone {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i <= 5; ++i) {
			for (j = 0; j <= i; ++j)
				System.out.print("* ");
			System.out.println();
		}
		for (i = 5; i >= 1; --i) {
			for (j = 1; j <= i; ++j)
				System.out.print("* ");
			System.out.println();
		}
		
		 int rows = 5;

	        for( i = rows; i >= 1; --i) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	            }

	            for( j=i; j <= 2 * i - 1; ++j) {
	                System.out.print("* ");
	            }

	            for( j = 0; j < i - 1; ++j) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	}

}
