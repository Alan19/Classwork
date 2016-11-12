package caveExplorer;

import java.util.Scanner;

public class TwoDArraysIntro {
	
	public static Scanner in = new Scanner(System.in);
	static int starti;
	static int startj;
	static String[][] arr2D;
	static String[][] pic;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args) {
		
//		boolean[][] mines = new boolean[6][6];
//		plantMines(mines);
//		String [][] field = createField(mines);
//		String [][] map = new String[6][10];
//		map = makeMap(map);
//		printPic(map);
		arr2D = new String[5][5];
		pic = new String[5][5];
		pic = wipeArray(pic);
		
		//populate with coordinates
		
		for(int row = 0; row < arr2D.length; row++){
			for (int col = 0; col < arr2D[row].length; col++) {
				arr2D[row][col] = "(" + row + ", " + col + ")";
			}
		}
		starti = 0;
		startj = 0;
		treasurei = 4;
		treasurej = 3;
		pic[0][0] = "x";
		printPic(pic);
		startExploring();
	}
	
	private static String[][] wipeArray(String[][] pic2) {
		for (int row = 0; row < pic.length; row++) {
			for (int col = 0; col < pic.length; col++) {
				pic[row][col] = " ";
			}
		}
		return pic2;
	}

	private static void startExploring() {
		while(true){
			System.out.println("You are in room " + arr2D[starti][startj] + ".");
			if(starti == treasurei && startj == treasurej){
				System.out.println("Congratulations! You have found the treasure");
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
			wipeArray(pic);
			pic[starti][startj] = "x";
			printPic(pic);
		}
		
	}

	private static int[] interpretInput(String input) {
		while(!isValid(input)){
			System.out.println("Sorry, in this game you can only use the WASD controls. \nTell me again what you would like to do.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w")) currenti--;
		if(input.equals("s")) currenti++;
		if(input.equals("a")) currentj--;
		if(input.equals("d")) currentj++;
		int[] newCoordinates = {starti, startj};
		if(currenti >= 0 && currenti < arr2D.length && currentj >= 0 && currentj < arr2D[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}
		else{
			System.out.println("Sorry, you have reached the edge of the universe. You may not go any farther in that direction.");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		for (int i = 0; i < validKeys.length; i++) {
			if(input.toLowerCase().equals(validKeys[i])){
				return true;
			}
		}
		
		return false;
	}

	private static String[][] makeMap(String[][] map) {
		for (int row = 0; row < map.length; row++) {
			for (int col = 0; col < map[0].length; col++) {
				if(row % 3 == 0){
					map[row][col] = "_";
				}
				else if(inCorner(map, row, col)){
					map[row][col] = " ";
				}
				else if (col % 2 == 0){
					map[row][col] = "|";
				}
				else{
					map[row][col] = " ";
				}
			}
		}
		return map;
	}

	private static boolean inCorner(String[][] map, int row, int col) {
		if((row == 0 && col == 0) || (row == 0 && col == map[row].length-1) || (row == map.length-1 && col == 0) || (row == map.length-1 && col == map[0].length-1)){
			return true;
		}
		return false;
	}

	private static void plantMines(boolean[][] mines) {
		int numberOfMines = 5;
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++){
			for (int col = 0; col < field[row].length; col++) {
				if(mines[row][col]) field[row][col] = "X";
				else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		int count = 0;
//		//Three ways of checking for indexOutOfBoundsException
//		for (int r = row - 1; r <= row+1; r++) {
//			for (int c = col; c <= col+1; c++) {
//				if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length){
//					
//				}
//				
//			}
//		}
		
//		//This method only considers actual elements
//		for (int r = 0; r < mines.length; r++) {
//			for (int c = 0; c < mines[r].length; c++) {
//				if(Math.abs(r-row) + Math.abs(c-col) == 1 && mines[r][c]){
//					count++;
//				}
//			}
//		}
		
		//This method allows you to be most specific. For example, you only want north and east
		count += isValidAndTrue(mines, row+1, col);
		count += isValidAndTrue(mines, row-1, col);
		count += isValidAndTrue(mines, row, col-1);
		count += isValidAndTrue(mines, row, col+1);
		return "" + count;
	}

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if (i >= 0 && j >= 0 && i < mines.length && j < mines[0].length && mines[i][j]){
			return 1;
		}
		else{
			return 0;
		}
	}

	public static void printPic(String[][] pic){
//		String[] xox = {"x", "o", "x", "o", "x", "o", "x"};
//		System.out.println(Arrays.toString(xox));
		
//		String[][] arr2D = new String[5][4];
//		System.out.println("The height is "+ arr2D.length);
//		System.out.println("The height is "+ arr2D[0].length);
//		
//		for(int row = 0; row < arr2D.length; row++){
//			//populate with coordinates
//			for (int col = 0; col < arr2D[row].length; col++) {
//				arr2D[row][col] = "(" + row + ", " + col + ")";
//			}
//		}
//		
//		//print the 2D array
//		//Every element in a 2D array IS itself an array, so a for-each loop looks like this
//		for (String[] row : arr2D) {
//			System.out.println(Arrays.toString(row));
//		}
//		String[][] pic = new String[10][8];
//		for(int row = 0; row < pic.length; row++){
//			//populate with coordinates
//			for (int col = 0; col < pic[row].length; col++) {
//				pic[row][col] = " ";
//			}
//		}
//		pic[1][3] = "|";
//		pic[1][2] = "\\";
//		pic[1][4] = "/";
//		
//		pic[2][3] = "O";
//		pic[3][3] = "|";
//		pic[3][2] = "/";
//		pic[3][4] = "\\";
//		pic[2][2] = "-";
//		pic[2][4] = "-";
//		for (int row = 5; row < pic.length; row++) {
//			for (int col = 0; col < pic[row].length; col++) {
//				pic[row][col] = "M";
//			}
//		}
//		for (int col = 0; col < pic[0].length; col++) {
//			pic[0][col] = "_";
//			pic[pic.length-1][col] = "_";
//		}
//		for (int row = 1; row < pic.length; row++) {
//			pic[row][0] = "|";
//			pic[row][pic[0].length-1] = "|";
//		}
//		for(int row = 0; row < pic.length; row++){
//			//populate with coordinates
//			for (int col = 0; col < pic[row].length; col++) {
//				if(row == 0 || row == pic.length-1){
//					pic[row][col] = "_";
//				}
//				else if (col == 0 || col == pic[row].length-1) {
//					pic[row][col] = "|";
//				}
//			}
//		}
		for (String[] row : pic) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
		
	}

}