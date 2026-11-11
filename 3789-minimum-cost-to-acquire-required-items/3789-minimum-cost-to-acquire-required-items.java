class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long total = 0;
        if((cost1 + cost2) <= costBoth){
            total = (long) cost1 * need1 + (long) cost2 * need2;
            return total;
        }else{
            long both = Math.min(need1,need2);
            total += (long)costBoth * (long)both;
            need1 -= both;
            need2 -= both;
            if(need1 > 0){
                total += (long) need1 * (long)Math.min(cost1,costBoth);
                
            }else if(need2>0)
                total += (long)need2 * (long) Math.min(cost2,costBoth);
            return total;
        }
         
    }
}