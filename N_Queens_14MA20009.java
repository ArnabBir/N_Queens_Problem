import java.util.Scanner;

public class N_Queens_14MA20009 {	
		
		//Global values
		private int[] position; // denotes the position of the queen in a column
		private boolean[] placed; // denotes whether a particular row is occupied or not
		private static int count = 0; // counts the number of solutions
		
		public N_Queens_14MA20009(int n) {
			
			position = new int[n];
			placed = new boolean[n];
			
			for (int i=0; i<n; i++) {
				position[i] = -1;
				placed[i] = false;
			}
		}

		private boolean canPlace(int col, int row) {
	    		for (int i=0; i<col; ++i)
	        		if (Math.abs(col - i) == Math.abs(position[i] - row)) // Diagonal element has equal horizontal and vertical distance
	            			return false;
	    		return true;    
		}

		public void placeQueen(int col) {
	    
	    		if (col == position.length) {
	        		++count;
	    		}

			for (int i=0; i<position.length; ++i) {
	        		if (placed[i] == false) {
	        		    	if (canPlace(col, i)) {
	        		        	position[col] = i; 
	        		        	placed[i] = true;
	        		        	placeQueen(col + 1);
	        		        	placed[i] = false;
	        		    	}                         
	        	                         
	        		}    
	    		}
	     
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of queens(n): ");
			int n = sc.nextInt();
			N_Queens_14MA20009 queen = new N_Queens_14MA20009(n);
	    		queen.placeQueen(0);
			System.out.println("Number of possibilities = " + count);
		}
}
