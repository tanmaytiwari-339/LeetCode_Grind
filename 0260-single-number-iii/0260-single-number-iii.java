class Solution {
    public int[] singleNumber(int[] nums) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int[] ans = new int[2];
        int i=0;
        for(int a : map.keySet()){
            if(map.get(a)==1) ans[i++]=a;
        }
        Arrays.sort(ans);
        return ans;
        */
        long ele = 0;
        for(int i : nums){
            ele = ele^i;
        }
        int nel = (int)((ele & (ele-1)) ^ ele);

        int b1=0;
        int b2=0;
        for(int i : nums){
            if((i & nel)!=0) b1=b1^i;
            else b2=b2^i;
        }
        return new int[] {b1,b2};
        
    }
}