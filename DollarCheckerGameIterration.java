
public class DollarCheckerGameIterration {

	/**
	 *  Compared to the Recursive solution, this solution is more efficient as it is faster and requires less memory
	 *  But the Recursive solution in this case is more natural
	 */
	
	public static void main(String[] args) {
		/* Create the board (an array of size 9 x 9) */
		
		int [][]board =         { {1, 2, 3, 4, 5, 6, 7, 8, 9},
				  	  {9, 8, 7, 6, 5, 4, 3, 2, 1},
				          {2, 4, 6, 8, 2, 4, 6, 8, 2},
				          {1, 1, 1, 6, 1, 1, 1, 1, 1},
				          {1, 2, 3, 4, 5, 6, 7, 8, 9},
				  	  {9, 8, 7, 6, 5, 4, 3, 2, 1},
				          {2, 4, 6, 8, 2, 4, 6, 8, 2},
				          {1, 1, 1, 6, 1, 1, 1, 1, 1},
				          {1, 2, 3, 4, 5, 6, 7, 8, 9}};  
		
		//Initialize the first position of the checker on the board
		int row = 4;
		int column = 3;
		
		//start accumulating the sum from the first position of the checker
		int sum = board[row][column];
		
		while ((row<board.length-1) && (column<board.length-1) && ((column>=0))){  //Deal with the outOfBound problem
			
			
			int max = Math.max(board[row+1][column-1], board[row+1][column+1]);
				
			sum += max;
				
			
			if ( board[row+1][column-1] > board[row+1][column+1] ){
				column = column - 1; //Set the next column position of the checker
			}
			else{
				column = column + 1; //Set the next column position of the checker
			}
			row++;                   //Set the next row position of the checker
			
		}
		
		System.out.println("The maximum amount that you have collected is: $" + sum);
	}
}


