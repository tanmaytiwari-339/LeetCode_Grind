class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxSum =0;
        for(int i=0;i<k;i++){
            maxSum+=cardPoints[i];
        }

        int sum = maxSum;
        int s = k-1;
        int e = n-1;
        while(s>=0){
            sum=sum-cardPoints[s]+cardPoints[e];
            maxSum=Math.max(sum,maxSum);
            s--;
            e--;
        }
        return maxSum;
    }
}