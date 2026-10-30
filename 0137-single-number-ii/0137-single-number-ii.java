class Solution {
    public int singleNumber(int[] nums) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1) return key;
        }
        return -1;
        */
        /*
        int n = nums.length;
        int ans = 0;
        for(int i=0 ; i < 32 ; i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if((nums[j]&(1<<i))!=0) count ++;

            }
            if(count%3==1){
                ans = ans | (1<<i);
            }
        }
        return ans;
        */
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i+=3){
            if(nums[i]!=nums[i-1]) return nums[i-1];
        }
        return nums[n-1];

    }
}