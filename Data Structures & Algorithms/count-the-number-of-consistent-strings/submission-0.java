class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok=new boolean[26];
        for(char c:allowed.toCharArray())
        ok[c-'a']=true;
        int ans=0;
        for(String word:words){
            boolean good=true;
            for(char c:word.toCharArray()){
                if(!ok[c-'a']){
                    good=false;
                    break;
                }
            }
            if(good)
            ans++;
        }
        return ans;
        
    }
}