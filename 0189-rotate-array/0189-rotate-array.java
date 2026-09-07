class Solution {

    //Approach 1 using extra space i.e. O(n-k)
    /*
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int[] arr = new int[n-k];
        for(int i=0;i<n-k;i++){
            arr[i]=nums[i];
        }
        for(int i=n-k;i<n;i++){
            nums[i-(n-k)]=nums[i];
        }
        for(int i=k;i<n;i++){
            nums[i]=arr[i-k];
        }
    }
    */

    //Approach 2 optimal without using extra space
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}