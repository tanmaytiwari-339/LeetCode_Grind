class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotEle = pivot(nums);
        if(target>=nums[pivotEle] && target<=nums[n-1]){
            return bnSearch(nums,pivotEle,n-1,target);
        }else{
            return bnSearch(nums,0,pivotEle-1,target);
        }
        
    }
    public int bnSearch(int[] nums,int low,int high, int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;

    }
    public int pivot(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<e){

            int mid = s + (e - s)/2;
            if(nums[mid]>=nums[n-1]){
                s=mid+1;
            }else{
                e = mid;
            }

        }
        return e;
    }
}