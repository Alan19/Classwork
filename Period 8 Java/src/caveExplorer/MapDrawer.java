package caveExplorer;

public class MapDrawer {
	
	public static String[][] map;
	
	public static void main(String[] args) {
		map = new String[7][7];
		map = drawMap(map);
		printPic(map);
	}

	private static String[][] drawMap(String[][] map2) {
		for (int row = 0; row < map2.length; row++) {
			for (int col = 0; col < map2[1].length; col++) {
				if(col % 2 == 0 && row != 0){
					map2[row][col] = "|";
				}
				else if(row % 3 == 0 && col != 0 && col != map2[row].length-1){
					map2[row][col] = "_";
				}
				else{
					map2[row][col] = " ";
				}
			}	
		}
		
		return map2;
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
