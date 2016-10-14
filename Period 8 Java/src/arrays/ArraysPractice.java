package arrays;

public class ArraysPractice {
	static boolean[] boos3;

	public static void main(String[] args) {
		boolean[] boos1 = new boolean[3];
		
		//This can only be done at the declaration because it sets size and content
		boolean[] boos2 = {false, false, false};
		
		/**
		 * This does not work
		 * boos3 = {false, true, true};
		 */
		
		//This is all that will work
		boos3 = new boolean[3];
		
		//Two ways of iterating through an array
		/**Standard
		 * 	The index is important to keep track if
		 * 	You need to customize the order
		 */
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		/**For each loop
		 * 	Index is not important
		 * 	You don't need to customize
		 * 	Automatically assigns a "handle"
		 */
		for(boolean b: boos2){
			System.out.println(b);
		}
		
		//Object Arrays
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a", "b", "c"};
		
		/*for(String s:someStrings1){
			System.out.println(s);
			String a = s.substring(0);
		}*/
		
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new string";
		}
		for(String s: someStrings1){
			System.out.println(s);
		}
	}

}
