class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int w:weights){
        start=Math.max(start,w);
        end+=w;
    }
    while(start<end){
        int mid=start+(end-start)/2;
        int total=0;
        int needDays=1;
        for(int w:weights){
            if(total+w>mid){
                needDays++;
                total=0;
            }
            total+=w;

        }
        if(needDays<=days){
            end=mid;
        }else{
            start=mid+1;
        }
    }
        return start;
    }
}
