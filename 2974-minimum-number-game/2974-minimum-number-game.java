class Solution {
    public int[] numberGame(int[] nums) {
        
        Arrays.sort(nums);
        
        int left = 0, right = 1, len = nums.length;
        
        while(left < len && right < len)
        {   
            nums[left] = nums[left] + nums[right];
            nums[right] = nums[left] - nums[right];
            nums[left] = nums[left] - nums[right];
            
            left += 2;
            right += 2;
        }
        

        return nums;
    }
}