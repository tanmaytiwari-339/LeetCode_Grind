class Solution {
    //Brute Force Approach TC=>O(n^2) SC=>O(1)
    /*
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    */
    //Approach 2 Using HashMap(TC=O(n) SC=O(n))
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = target-nums[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};   
    }
    
    
}