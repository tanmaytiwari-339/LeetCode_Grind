class Solution {
    public String digitSum(String s, int k) {
        StringBuilder ans = new StringBuilder(s);
        int n = ans.length();
        while(n>k){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i=i+k){
                int j=i;
                int count=0;
                while(j<n && j<k+i){
                    char ch = ans.charAt(j);
                    count += ch-'0';
                    j++;
                }
                sb.append(String.valueOf(count));
            }
            n=sb.length();
            ans = new StringBuilder(sb);
        }
        return ans.toString();
        
    }
}