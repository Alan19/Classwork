import java.lang.reflect.Array;

import javax.swing.plaf.multi.MultiDesktopIconUI;

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
    	int[] intArray = {9,6,1,4,3,6,7,9};
    	int[] intArray2 = {9,6,5,8,3,6,7,0,6,1,4,3,6,7,9};
    	int[] intArray3 = {4,3,2,1};
    	int[] intArray4 = {1,2,3,4};
    	double[] doubleArray = {1.0,3.1,7.3,5.8};
//    	String[] stringArray = {"a", "b", "c", "d", "e"};
//    	shuffle(stringArray);
//    	System.out.println(generateBetweenOneAndN(2));
//    	print(generateDistinctItemsList(10));
//    	cycleThrough(intArray, 26);
//    	print(intArray);
//    	System.out.println(isSorted(intArray3));
//    	sortArray(doubleArray);
//    	print(getStats(doubleArray));
//    	System.out.println(searchSorted(intArray3, 1));
    	System.out.println(longestSharedSequence(intArray, intArray2));
//    	print(getSequence(0, 4, intArray));
    }
    
    private static void print(double[] array) {
		for (double d : array) {
			System.out.println(d);
		}
		
	}

	private static void shuffle(Object[] array) {
    	for(int i = 0; i < array.length; i++){
    		int random = (int)(Math.random()*6);
    		swap(array, i, random);
    	}
	}

	private static void swap(Object[] arr, int a, int b) {
		Object temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
		
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
//    	for(int i = 0; i < sortedArrayToSearch.length; i++){
//    		if(sortedArrayToSearch[i] == key){
//    			return i;
//    		}
//    	}
    	int lowerBound = 0;
    	int upperBound = sortedArrayToSearch.length-1;
    	while(upperBound >= lowerBound){
    		int mid = (lowerBound+upperBound)/2;
    		System.out.println(lowerBound + " " + mid + " " + upperBound);
    		if(key == sortedArrayToSearch[mid]){
    			return mid;
    		}
    		else if(key < sortedArrayToSearch[mid]){
    			//System.out.println("a");
    			lowerBound = mid + 1;
    		}
    		else{
    			//System.out.println("b");
    			upperBound = mid - 1;
    		}
    	}
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
         sortArray(array);
         stats[0] = getMean(array);
         stats[1] = getMax(array);
         stats[2] = getMin(array);
         stats[3] = getMedian(array);
         stats[4] = valuesGreaterThanOrEqualToMean(array, stats[0]);
         stats[5] = valuesBelowMean(array, stats[0]);
         
         return stats;
    }
    
    private static double valuesBelowMean(double[] array, double mean) {
    	int values = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < mean){
				values++;
			}
		}
		return values;
	}

	private static double valuesGreaterThanOrEqualToMean(double[] array, double mean) {
		int values = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] >= mean){
				values++;
			}
		}
		return values;
	}

	private static double getMedian(double[] array) {
		if(array.length %  2 == 0){
			return (array[array.length/2]+array[(array.length/2)-1])/2;
		}
		else{
			return (array[array.length/2]);
		}
	}

	private static double getMin(double[] array) {
		return array[0];
	}

	private static void sortArray(double[] array) {
		//Sorts in ascending order
    	while(!isSortedDouble(array)){
			for(int i = 0; i < array.length-1; i++){
				if(!(array[i] < array[i+1])){
	        		swap(array, i, i+1);
	        	}
			}
		}
		
	}

	private static void swap(double[] arr, int a, int b) {
		double temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
		
	}

	private static boolean isSortedDouble(double[] array) {
		for(int i = 0; i < array.length-1; i++){
        	if(!(array[i] < array[i+1])){
        		return false;
        	}
        }
    	return true;
	}

	private static double getMax(double[] array) {
		return array[array.length-1];
	}

	private static double getMean(double[] array) {
    	double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum/(array.length);
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
         int differences = 0;
         for(int i = 0; i < array1.length; i++){
        	 if(array1[i] != array2[i]){
        		 differences++;
        	 }
         }
         return differences;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consecutive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
    	if(array1.length == 0){
    		return 0;
    	}
    	int currentStreak = 1;
    	int highestStreak = 1;
    	for(int i = 0; i < array1.length-1; i++){
    		if(array1[i] == array1[i+1]-1){
    			currentStreak++;
    		}
    		else{
    			if(currentStreak > highestStreak){
    				highestStreak = currentStreak;
    			}
    			currentStreak = 1;
    		}
    	}
    	return highestStreak;
    }

    public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         * since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
        
    	int max = 0;
    	int count = 0;
    	
    	for (int seqStart = 0; seqStart < array1.length-1; seqStart++) {
    		int seqEnd = array1.length-1;
    		int[] seq = getSequence(seqStart, seqEnd, array1);
			for(int j = 0; j < seq.length; j++){
				seqEnd = array1.length - j - 1;
				if(checkSequence(seq, array2)){
					count = seq.length;
				}
				if(count > max){
					max = count;
				}
			}
			//Reset the count after checking the sequence
			count = 0;
		}
    	
    	return max;
    	
    }

	private static boolean checkSequence(int[] seq, int[] array2) {
		//i checks every value in arr
		for (int i = 0; i < array2.length; i++) {
			//j checks every value in seq
			for (int j = 0; j < seq.length; j++) {
				if(j+i < array2.length && array2[j+i] != seq[j]){
					//breaks out of inner-most for loop unless particular loop is specified (labels: "A: for()")
					break;
				}
				else if(j == seq.length-1){
					return true;
				}
			}
		}
		return false;
	}

	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		int[] intArray = new int[seqEnd-seqStart];
		for (int i = 0; i < seqEnd-seqStart; i++) {
			//System.out.println(intArray[i]);
			intArray[i] = array1[i+seqStart];
		}
		return intArray;
	}

	public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
    	int[] intArray = new int[n];
    	for(int i = 0; i < n; i++){
    		 int genNumber = generateBetweenOneAndN(2*n);
    		 if(!notDuplicate(genNumber, intArray)){
    			 while(!notDuplicate(genNumber, intArray)){
    				 genNumber = generateBetweenOneAndN(2*n);
    			 }
    		 }
    		 intArray[i] = genNumber;
    	}
		return intArray;

    }
    
    
    private static boolean notDuplicate(int genNumber, int[] intArray) {
		for(int i = 0; i < intArray.length; i++){
			if(genNumber == intArray[i]){
				return false;
			}
		}
		return true;
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
		for(int i = 0; i < n; i++){
			//System.out.println(i);
			for(int j = 0; j < array.length-1; j++){
					swapIntArray(array, j, j+1);
			}
		}
    }
    
    private static void swapIntArray(int[] arr, int b, int a) {
    	int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}

	private static void print(int[] array){
    	for(int n: array){
    		System.out.println(n);
    	}
    }
    
    private static int generateBetweenOneAndN(int n){
    	return (int) (Math.random() * n) + 1;
    }
}
