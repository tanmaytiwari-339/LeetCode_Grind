class Solution {
    // Brute force Approach(TC => O(n+k) SC = > O(n))
    /*
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n = nums.length;
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return 0;
    }
    */
    // Removed the redundency of creatink full map TC => O(n) SC => O(n)
    /*
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) > n/2){
                return i;
            }
        }
        return 0;
    }
    */
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=nums[i];
                count=1;
            }else if(nums[i]==ele) count++;
            else count--;
        }
        return ele;
    }
}