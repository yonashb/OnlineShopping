package com.yonas;

public class MultiDimensionArray {
	 // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
    	Long value = 0L;
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Your resolution 
   // Time complexity:  n = lengthOfDeminsion.length, m = average of Length of Dimension => O(nm)
   // Space complexity: O(1)
    	
    	Long sum = 0L;
    	for(int i=0; i<lengthOfDeminsion.length; i++){
    		for(int j=0; j<lengthOfDeminsion[i]; j++){
    			sum += getValue(i, j);
    		}
    	}
    return sum;
    }
}
