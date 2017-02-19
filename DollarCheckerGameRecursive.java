public class DollarCheckerGameRecursive {

	public static void main(String[] args) {
		/* Create the board (an array of size 9 x 9) */
		
		int [][]board = { {1, 2, 3, 4, 5, 6, 7, 8, 9},
		  		  {9, 8, 7, 6, 5, 4, 3, 2, 1},
		                  {2, 4, 6, 8, 2, 4, 6, 8, 2},
		                  {1, 1, 1, 6, 1, 1, 1, 1, 1},
		                  {1, 2, 3, 4, 5, 6, 7, 8, 9},
		  		  {9, 8, 7, 6, 5, 4, 3, 2, 1},
		                  {2, 4, 6, 8, 2, 4, 6, 8, 2},
		                  {1, 1, 1, 6, 1, 1, 1, 1, 1},
		                  {1, 2, 3, 4, 5, 6, 7, 8, 9}};    
		
		
		System.out.println("The maximum amount that you have collected is: $" + amountCollected(board, 4, 3));
		
	}
	
	/**
	 * Recursive Solution
	 * @param checkerBoard the array
	 * @param row start position
	 * @param column start position
	 * @return the maximum amount collected 
	 */
	public static int amountCollected (int[][]checkerBoard, int row, int column){
		
		if (column < 0 || column > checkerBoard.length-1){
			
			return 0;
		}
		
		else if(row == (checkerBoard.length-1)){
			
			return checkerBoard [row][column];
		}
				
		else 
		
		{
			return checkerBoard [row][column]+ Math.max(amountCollected(checkerBoard, (row+1), (column-1)), amountCollected (checkerBoard, (row+1), (column+1)));
			
		}
		
	}
}



