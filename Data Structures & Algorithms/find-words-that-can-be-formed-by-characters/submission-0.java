class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count=new int[26];
        for(char c:chars.toCharArray()){
        count[c-'a']++;
        }
        int ans=0;
        for(String word:words){
        int[] temp=count.clone();
        boolean good=true;
        for(char c: word.toCharArray()){
        if(temp[c-'a']==0){
            good=false;
            break;
        }
        temp[c-'a']--;
        
    }
    if(good){
    ans += word.length();
        }

    }
    return ans;
}

}