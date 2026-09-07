class Solution {
    public int minOperations(String s) {
        int startWith0=0;
        int startWith1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(i%2==0 ? '0':'1')){
                startWith0++;
            }
            if(s.charAt(i)!=(i%2==0 ? '1':'0')){
                startWith1++;
            }
        }
        return Math.min(startWith0,startWith1);
        
    }
}