package arrays;

public class Test2Review {
	
	public static boolean[][] grid = new boolean[5][5];

	public static void main(String[] args) {
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid[i].length; j++) {
//				int randomNumber = (int)Math.random()*3;
//				if(randomNumber >= 1)
//					grid[i][j] = true;
//				else
//					grid[i][j] = false;
//			}
//		}
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3, 3);
		printGrid(grid);
	}
	
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < grid.length)
			switchRow(grid[r], c);
		
		switchColumn(grid, r, c);
		
		//check if a single light is on
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if(grid[row][col]) return;
			}
		}
		System.out.println("You have solved the puzzle!");
	}
	
	public static void switchRow(boolean[] row, int x) {
		//switch row[x-1], row[x], row[x+1] if they exist
		for (int i = -1; i < 2; i++) {
			if (x+i >= 0 && x+i < row.length) {
				row[x+i] = !row[x+i];
			}
		}
	}
	
	private static void switchColumn(boolean[][] grid, int r, int c) {
		//switches above and below if they exist
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	
	private static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}

	public static void printGrid(boolean[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j])
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println("");
		}
		System.out.println("---------");
	}

}
