class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean ans=true;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min) min = nums1[i];
            if(nums1[i]%2==1) ans = false;
        }
        if(min%2==1) return true;
        return ans;
        
    }
}