class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==0){
                arrange(nums,i);
            }
        }
    }
    public void arrange(int[] nums,int i){
        int n=nums.length;
        while(i<n-1){
            int temp = nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            i++;
        }
    }
    
}