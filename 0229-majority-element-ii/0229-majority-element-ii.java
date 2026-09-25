class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int majEle1 = 0;
        int count1 = 0;
        int majEle2 = 0;
        int count2 = 0;
        for(int i=0; i< nums.length; i++){
            if(majEle1==nums[i]){
                count1++;
            }else if(majEle2==nums[i]){
                count2++;
            }else if(count1==0){
                majEle1=nums[i];
                count1=1;
            }else if(count2==0){
                majEle2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == majEle1) {
                count1++;
            }
            else if (num == majEle2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) {
            ans.add(majEle1);
        }

        if (count2 > nums.length / 3) {
            ans.add(majEle2);
        }

        return ans;
        
    }
}