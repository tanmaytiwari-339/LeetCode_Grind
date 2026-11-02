class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int mid = n/2;
        int count = 0;
        for(int a : nums){
            count+= Math.abs(a-nums[mid]);
        }
        return count;
        
    }
}