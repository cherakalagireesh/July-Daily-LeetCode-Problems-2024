class Solution {
        public boolean canJump(int[] nums) {
            
            int maxIdx = 0;
            int len = nums.length;

            for(int i = 0 ; i < len ; i++)
            {
                if(i > maxIdx)
                    return false;
                
                maxIdx = Math.max(maxIdx, i + nums[i]);
            }

            return true;
        }

}