class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int a : nums){
            sum+=a;
        }
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(count==sum-nums[i]){
                return i;
            }
            count+=nums[i];
            sum=sum-nums[i];
        }
        return -1;
        
    }
}