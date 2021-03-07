package com.sumit;

public class Solution {
	
	public static int climbStairs(int n) {
        
		  /*Constraint is:
		   * We can take either 1 step or 2 steps only.
		   * 
		   */
		
		  //array will have n+1 elements because we are also considering 0th step
	      int [] step = new int [n+1];
	      
	        //ways to get at 0th step will always be 1
	        step[0] = 1;
	        
	        //ways to get at 1st step will always be 1
	        step[1] = 1;
	        
	        //so we start from 2nd step
	        for(int i=2;i<=n;i++)
	        {
	        	/*there are only two ways to reach at ith step considering the constraints as mention
	        	 * above for this problem .
	        	 * 1. taking one step before the ith step.
	        	 * 2. taking two steps before the ith step. 
	        	 */
	            step[i] = step[i-1]+step[i-2];
	        }
	        
	        return step[n];   
	    }
	
	public static void main(String[] args) 
	{
		
		System.out.println(Solution.climbStairs(4));
	}

}
