class Solution {
    /*
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int sum =0;
            for(int j = i;j<n;j++){
                sum+=arr[j];
                if(sum%2!=0){
                    count++;
                }

            }
        }
        return count; 
    }
    */
    public int numOfSubarrays(int[] arr) {
        long mod = 1000000007;
        int n = arr.length;
        int e = 1;
        int o = 0;
        long sum = 0;
        long ans = 0;
        for(int i=0;i<n;i++){
            int x = arr[i];
            sum+=x;
            if(sum%2!=0){
                ans = ans + e;
                o++;
            }else{
                ans = ans + o;
                e++;
            }
        }
        return (int)(ans%mod);
    }

}