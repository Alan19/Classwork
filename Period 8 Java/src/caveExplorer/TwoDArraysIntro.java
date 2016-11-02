package caveExplorer;

import java.util.Arrays;
import java.util.function.Function;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TwoDArraysIntro {

	public static void main(String[] args) {

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