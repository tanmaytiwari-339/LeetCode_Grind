class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        int j=n-1;
        int[] arr = new int[n];
        int mi = Integer.MAX_VALUE;
        while(j>=0){
            mi=Math.min(mi,nums[j]);
            arr[j] = mi;
            j--;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            int min = arr[i];
            int score = max - min;
            if(score<=k){
                if(score<ans){
                    ans=score;
                    index=i;
                    break;
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return index;  
    }
    
}