class Solution {
    public boolean checkString(String s) {
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(flag==0){
                    continue;
                }else return false;
            }else{
                flag=1;
            }
        }
        return true;
        
    }
}