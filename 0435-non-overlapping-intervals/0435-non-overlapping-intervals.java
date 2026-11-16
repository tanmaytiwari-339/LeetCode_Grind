class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int n = intervals.length;
        int count=0;
        int endInt = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(intervals[i][0]>=endInt){
                count++;
                endInt = intervals[i][1];
            }
        }
        return n-count;
        
    }
}