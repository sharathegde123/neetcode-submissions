class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int start=0;
        int end=nums[nums.length-1]-nums[0];
        while(start<end){
            int mid=start+(end-start)/2;
            int pairs=0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i+1]-nums[i]<=mid){
                    pairs++;
                    i++;
                }
                if(pairs==p)
                break;


            }
            if(pairs>=p){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
        
    }
}