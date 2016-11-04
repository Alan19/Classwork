package caveExplorer;

import java.util.Scanner;

import introduction.StringPractice;

public class ConenctFour {

	public static Scanner in;
	public static String[][] theGrid;
	static int maxPieces;
	public static int[] columns;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		theGrid = new String[8][17];
		theGrid = generateGrid(theGrid);
		maxPieces = theGrid.length-1;
		columns = new int[theGrid[0].length-1];
		
		printPic(theGrid);
		playConnectFour();
	}

	private static void playConnectFour() {
		while(true){
			System.out.println("Choose a column");
			String input = in.nextLine();
			interpretInput(input);
		}
	}

	private static void interpretInput(String input) {
		// TODO Auto-generated method stub
		
	}

	private static String[][] generateGrid(String[][] theGrid) {
		for (int row = 0; row < theGrid.length; row++) {
			for (int col = 0; col < theGrid[1].length; col++) {
				if(col % 2 == 0 && row != 0){
					theGrid[row][col] = "|";
				}
				else{
					theGrid[row][col] = " ";
				}
			}
		}
		int count = 1;
		for(int col = 1; col < theGrid[0].length; col++){
			if(col % 2 != 0){
				theGrid[0][col] = "" + (count);
				count++;
//				if (col < columns.length)
//				{
//					columns[count - 1] = col;					
//				}
			}
		}
		
		return theGrid;
	}

	public static void printPic(String[][] pic){
		for (String[] row : pic) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
