class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gn = g.length;
        int sn = s.length;
        int i=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(j<sn){
            if(i==gn) break;
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
        
    }
}