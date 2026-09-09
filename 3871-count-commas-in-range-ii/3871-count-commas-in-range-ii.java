class Solution {
    //Jhantu approach by me
    /*
    public long countCommas(long n) {
        long i=15;
        long ans = 0;
        while(Math.pow(10,i)-1 != 0){
            if(n-Math.pow(10,i)-1 > 0){
                long x = n-1-(long)Math.pow(10,i);
                ans = x * (i/3);
                n=n-x;
            }
            i=i-3;
        }
        return ans;
    }
    */
    public long countCommas(long n){
        long ans =0;
        for(long i=1000;i<=n;i*=1000){
            ans=ans+(n-i+1);
        }
        return ans;
    }
}