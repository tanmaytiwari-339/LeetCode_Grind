class Solution {
    //Approach 1 and 2( TC = O(n^2))
    /*
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
        while(i<n-1 && nums[i+1]!=0){
            int temp = nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            i++;
        }
    }
    */
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[i]!=0){
                i++;
            }else{
                if(nums[j]!=0){
                    swap(nums,i,j);
                    i++;
                }
            }
            j++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}