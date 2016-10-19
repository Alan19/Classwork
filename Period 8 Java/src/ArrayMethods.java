
public class ArrayMethods {

    public static void main(String[] args) {
    
     /**
      * IMPORTANT NOTE: 
      * This homework assignment will be weighted 4x.
      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
      * DO NOT spend hours and hours trying to fix perfect code just because my test
      * says that it isn't perfect!
      * */
    	int[] intArray = {1,2,3,4,5,6,7};
    	//reverseOrder(intArray);
    	//print(intArray);
    	//System.out.println(longestConsecutiveSequence(intArray));
    	int[] intArray2 = {1000, 994, 989, 987, 984, 980, 975, 972, 968, 964, 963, 962, 957, 955, 954, 951, 949, 947, 945, 939, 933, 928, 923, 921, 920, 914, 910, 908, 906, 904, 902, 901, 897, 894, 892, 890, 887, 886, 881, 877, 876, 874, 869, 865, 859, 856, 855, 851, 847, 846, 840, 837, 835, 830, 826, 823, 820, 819, 813, 812, 811, 807, 805, 804, 800, 797, 794, 790, 784, 781, 777, 772, 767, 761, 758, 756, 754, 749, 743, 740, 739, 735, 734, 729, 727, 722, 721, 719, 717, 712, 706, 700, 694, 688, 683, 682, 679, 673, 672, 666, 665, 659, 658, 657, 653, 649, 645, 641, 639, 638, 634, 630, 629, 626, 625, 623, 622, 616, 610, 607, 601, 598, 593, 588, 586, 580, 574, 571, 568, 565, 559, 558, 552, 548, 542, 541, 537, 533, 530, 529, 526, 522, 518, 514, 513, 508, 505, 500, 498, 494, 493, 491, 485, 481, 480, 474, 468, 464, 460, 454, 452, 447, 444, 439, 435, 429, 423, 417, 415, 412, 408, 405, 402, 399, 395, 389, 383, 379, 376, 371, 369, 365, 362, 359, 355, 349, 344, 340, 337, 332, 326, 325, 320, 319, 317, 312, 310, 309, 306, 303, 302, 301, 296, 293, 291, 285, 283, 280, 279, 276, 270, 267, 264, 259, 254, 250, 248, 245, 242, 237, 233, 229, 225, 223, 217, 213, 207, 202, 197, 196, 195, 191, 186, 182, 177, 172, 169, 166, 164, 159, 155, 152, 147, 144, 142, 137, 133, 129, 126, 125, 123, 119, 115, 113, 110, 106, 101, 100, 97, 93, 89, 85, 81, 79, 77, 71, 70, 65, 60, 59, 57, 56, 50, 44, 40, 34, 31, 25, 22, 18, 17, 14, 13, 10, 4, 0, -2, -3, -4, -5, -6, -8, -12, -18, -20, -24, -30, -36, -42, -46};
    	int[] intArray3 = {300, 294, 288, 286, 285, 282, 279, 276, 270, 266, 261, 258, 253, 248, 245, 240, 238, 233, 227, 225, 219, 218, 212, 210, 209, 208, 203, 197, 195, 189, 188, 182, 176, 175, 171, 170, 166, 163, 160, 154, 152, 149, 148, 146, 140, 139, 135, 133, 127, 123, 122, 118, 117, 111, 106, 103, 101, 98, 92, 90, 86, 83, 77, 73, 68, 64, 59, 53, 48, 46, 41, 38, 35, 32, 26, 25, 19, 17, 15, 9, 4, 0, -6, -8, -9, -11, -14, -17, -18, -19, -25, -30, -31, -34, -35, -39, -42, -44, -45, -46, -51, -54, -60, -63, -67, -71, -77, -79, -82, -87, -92, -95, -98, -102, -103, -106, -108, -114, -117, -118, -119, -122, -125, -128, -129, -135, -138, -143, -146, -152, -157, -159, -164, -170, -176, -182, -185, -187, -188, -192, -196, -198, -201, -202, -208, -209, -210, -213, -219, -223, -227, -231, -236, -238, -242, -247, -248, -251, -256, -258, -260, -262, -263, -264, -269, -274, -278, -279, -280, -285, -286, -287, -291, -293, -298, -302, -304, -307, -313, -319, -322, -326, -327, -333, -335, -337, -341, -344, -348, -353, -354, -357, -363, -365, -366, -371, -372, -378, -379, -382, -383, -384, -390, -395, -399, -401, -403, -405, -406, -408, -411, -412, -414, -416, -421, -427, -428, -431, -435, 301, -444, -449, -450, -451, -455, -456, -462, -466, -469, -474, -477, -479, -483, -487, -492, -496, -498, -503, -508, -513, -518, -521, -526, -527, -528, -533, -534, -536, -540, -543, -545, -549, -551, -553, -557, -561, -566, -567, -569, -571, -576, -582, -588, -594, -600, -603, -604, -610, -616, -620, -625, -628, -630, -632, -637, -639, -644, -647, -652, -655, -661, -665, -670, -676, -682, -688, -694, -700, -702, -708, -711, -712, -717, -723, -729, -734, -740, -743, -749, -754};

    	System.out.println(isSorted(intArray3));
    }
    
    public static int searchUnsorted(int[] arrayToSearch, int key){
    /**
     * this method take an unsorted int array (arrayToSearch) and returns an 
     * int corresponding to the index of a key, if it is in the array
     * if the key is not in the array, this method returns -1
     * */
    	for(int i = 0; i < arrayToSearch.length; i++){
    		if(arrayToSearch[i] == key){
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static int searchSorted(int[] sortedArrayToSearch, int key){
    /**
     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
     * always be sorted in DESCENDING order. Again return the index of the key or return -1
     * if the key is not in the array
     * 
     * Note: You should attempt to write a method that is more efficient that searchUnsorted
     * */
     return -1;
    }
    
    public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
        for(int i = 0; i < array.length-1; i++){
        	if(!(array[i] > array[i+1])){
        		//System.out.print(array[i] + " " + array[i+1]);
        		return false;
        	}
        }
    	return true;
    }
    
    
    public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
         double[] stats = new double[6];
         return stats;
    }
    
    public static void reverseOrder(int[] array){
        /**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
    	int[] tempArray = new int[array.length];
    	for(int i = 0; i < array.length; i++){
    		tempArray[array.length - (i + 1)] = array[i];
    	}
    	for(int i = 0; i < array.length; i++){
    		array[i] = tempArray[i];
    	}
    	//print(array);
    }
    
    public static int countDifferences(int[] array1, int[] array2){
        /**Here, you will write an method that returns the number of values in two arrays 
         * that are NOT the same (either in value OR location).
         * The arrays ALWAYS have the same length
         * Examples:
         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
         * 
         * */
         return 0;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
        return 1;
    }

    public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
        
        return 0;
    }

    public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
        return null; 
    }
    
    
    public static void cycleThrough(int[] array, int n){
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
    }
    
    private static void print(int[] array){
    	for(int n: array){
    		System.out.println(n);
    	}
    }
}
