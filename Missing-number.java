class Solution {
    public int missingNumber(int[] nums) {
      // Array indicating which numbers are contained in nums, where the indicies are the numbers
		// 1 size larger than nums, since nums can be from 0 to n (inclusive)
        boolean[] seen = new boolean[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
			// Number at the current index
            int num = nums[i];
            
			// Indicate we have seen this number
            seen[num] = true;
        }
        
		// Iterate through seen array
        for (int j = 0; j < seen.length; j++) {
			// If the value at index j is false, we haven't seen it and it is the missing number
            if (!seen[j]) return j;
        }
        
        return -1;
    }
}
