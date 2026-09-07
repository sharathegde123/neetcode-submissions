class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];// store frequency of each character
        // count frequencies
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
            int maxOdd=0;// maximum odd frequency
            int minEven=Integer.MAX_VALUE;// minimum even frequency
              // find max odd and min even
            for(int f:freq){
                if(f==0)continue;// skip characters not present

                if(f%2==1){
                    maxOdd=Math.max(maxOdd,f);
                }else{
                    minEven=Math.min(minEven,f);
                }
                }
                return maxOdd-minEven;
            }
        }
        
    
