class Solution {
    public boolean makeEqual(String[] words) {
        int count[]=new int[26];
        //count every character
        for(String word:words)
        for(char ch:word.toCharArray()){
            count[ch-'a']++;
        }
        //check devisibility
        for(int i=0;i<26;i++){
            if(count[i]%words.length!=0){
                return false;
            }
        }
        return true;


        
    }
}