package com.yonas;

import java.util.List;

public class LIstAlgorithms {
	 // Your resolution 
	   // Time complexity:  O(kn)
	   // Space complexity: O(k)
	public boolean separate(List<Integer> list, int k){
		
		int sum = 0;
		
		for(Integer i : list){
			sum+=i;
		}
		
		if(sum%k!=0){
			return false;
		}
		
		int n = list.size();
		
		int[] K = new int[k];
		
		for(int i=0; i<K.length; i++){
			K[i]=(sum/k);
		}
		
		  return separateRec(list, n-1,K);
		}
	
	boolean separateRec(List<Integer> list, int n, int[] K){
		
		if(checkSum(K)){
			return true;
		}
		
		if(n<0){
			return false;
		}
		boolean result = false;
		for(int i=0; i<K.length; i++){
			if(!result && K[i]-list.get(n)>=0){
				K[i] = K[i]-list.get(n);
				result=separateRec(list, n-1, K);
				K[i] = K[i]+list.get(n);
			}
		}
		return result;
	}
	
	boolean checkSum(int[] N){
		boolean result = true;
		for(int i=0; i<N.length; i++){
			if(N[i]!=0){
				result = false;
			}
		}
		return result;
	}
		  // JUnit test cases 
}
