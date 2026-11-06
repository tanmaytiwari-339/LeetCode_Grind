class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        /* Brute Force TC = O(l X q)
        int q = queries.length;
        int n1 = logs.length;
        int[] ans = new int[q];
        for(int i=0;i<q;i++){
            int low = queries[i]-x;
            int high = queries[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0;j<n1;j++){
                if(logs[j][1]>=low && logs[j][1]<=high){
                    set.add(logs[j][0]);
                }
            }
            int s = set.size();
            ans[i]=n-s;
        }
        return ans;
        */
        int l1 = logs.length;
        int q1 = queries.length;
        int[][] q = new int[q1][2];
        int[] ans = new int[q1];
        for(int i=0;i<q1;i++){
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q, (a,b) -> a[0] - b[0]);
        Arrays.sort(logs, (a,b) -> a[1] - b[1]);
        int p1=0;
        int p2=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < q1;i++){
            int low = q[i][0]-x;
            int high = q[i][0];

            while(p2<l1 && logs[p2][1]<=high){
                map.put(logs[p2][0],map.getOrDefault(logs[p2][0],0)+1);
                p2++;
            }
            while(p1<l1 && logs[p1][1]<low){
                
                map.put(logs[p1][0],map.getOrDefault(logs[p1][0],0)-1);
                if(map.get(logs[p1][0])==0) map.remove(logs[p1][0]);
                p1++;
            }
            int res = n - map.size();
            ans[q[i][1]] = res;
        }
        return ans;

    }
}