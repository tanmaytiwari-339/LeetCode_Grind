class Solution {
    public boolean canAliceWin(int n) {
        boolean ans = false;
        int c = 10;
        while(n>=c){
            n=n-c;
            c--;
            ans=!ans;
        }
        return ans;
        
    }
}