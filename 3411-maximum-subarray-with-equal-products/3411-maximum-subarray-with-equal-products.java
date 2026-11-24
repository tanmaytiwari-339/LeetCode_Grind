class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            long prod = 1;
            int ans = 0;
            int lc = 1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                ans = gcd(ans,nums[j]);
                lc = lcm(lc,nums[j]);
                if(prod == (long) lc * ans){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public int lcm(int a, int b){
        return ( a / gcd(a,b)) * b;
    }
}