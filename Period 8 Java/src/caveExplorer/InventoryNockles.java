package caveExplorer;

public class InventoryNockles {
	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		hasMap = true;
		updateMap();
	}

	private void updateMap() {
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//Convert these caves to a string representation
		map = " ";
		//Horizontal line across top row with width 4 except for last column
		for (int i = 0; i < caves[0].length-1; i++) {
			map += "____";
		}
		map+="___\n";
		for (CaveRoomPd8[] row : caves) {
			//there are three rows of text
			for (int textRow = 0; textRow < 3; textRow++) {
				for (CaveRoomPd8 cr : row) {
					String str = "|   ";
					String contents = cr.getContents();
					if (textRow == 1 && cr.getDoor(CaveRoomPd8.WEST) != null) {
						str = "  " + contents + " ";
					}
					else if (textRow == 2) {
						if(cr.getDoor(CaveRoomPd8.SOUTH) == null){
							str = "|___";
						}
						else {
							str = "|_ _";
						}
					}
					map+=str;
				}//end of row of caverooms
				map+="|\n";
			}
		}
	}

	public String getDescription() {
		if(hasMap) return map;
		else return "You have no inventory";
	}

}
