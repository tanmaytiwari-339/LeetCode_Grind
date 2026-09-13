class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i]==val){
                int j=i;
                while(j<n-1){
                    swap(nums,j,j+1);
                    j++;
                }
                n--;
            }else{
                i++;
            }
            
        }
        return n;
        
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}