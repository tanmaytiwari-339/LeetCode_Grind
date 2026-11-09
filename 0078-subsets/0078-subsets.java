class Solution {
    /*
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(nums,ans,list,0);
        return list;
        
    }
    public void helper(int[] nums,List<Integer> ans, List<List<Integer>> list, int index){
        if(index==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[index]);
        helper(nums,ans,list,index+1);
        ans.remove(ans.size()-1);
        helper(nums,ans,list,index+1);

    }
    */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subSets = (1<<n);
        for(int i=0 ; i<subSets ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0) list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;
    }

}