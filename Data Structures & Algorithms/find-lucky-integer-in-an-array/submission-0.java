class Solution {
    public int findLucky(int[] arr) {
        int[] count=new int[501];
        for(int nums:arr){
        count[nums]++;
        }
        int ans= -1;
        for(int i=1;i<=500;i++){
            if(count[i]==i){
               ans=i;
            }
        }
        return ans;
     
        
    }
}