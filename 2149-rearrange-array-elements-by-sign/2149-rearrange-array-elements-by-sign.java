class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int p=0;
        int n=1;
        for(int x : nums){
            if(x<0){
                ans[n] = x;
                n=n+2;
            }else{
                ans[p] = x;
                p=p+2;
            }
        }
        return ans;
        
    }
}