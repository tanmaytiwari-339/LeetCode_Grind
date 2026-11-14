class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int count=Integer.MAX_VALUE;
        for(int i = 0; i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
                int len = j-i+1;
                if((j-i+1)>=l && (j-i+1)<=r && sum>0){
                    if(count == Integer.MAX_VALUE){
                        count=sum;
                    }else{
                        count=Math.min(count,sum);
                    }
                }
                if(len>=r) break;
                
            }
        }
        return count==Integer.MAX_VALUE ? -1 : count;
        
    }
}