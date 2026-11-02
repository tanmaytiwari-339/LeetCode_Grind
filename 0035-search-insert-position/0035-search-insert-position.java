class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
        int n = nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return end+1;
        */
        int n = nums.length;
        int s = 0;
        int e = n;
        while(s<e){
            int mid = s + (e-s)/2;
            if(nums[mid]<target) s = mid + 1;
            else e = mid;
        }
        return s;   
    }
}