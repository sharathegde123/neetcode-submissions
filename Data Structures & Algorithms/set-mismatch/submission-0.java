class Solution {
    public int[] findErrorNums(int[] nums) {
    int[] count=new int[nums.length+1];
    for(int num:nums){
        count[num]++;
    }
    int missing=0;
    int repeated=0;
    for(int i=1;i<=nums.length;i++){
        if(count[i]==2){
            repeated=i;
        }
        if(count[i]==0){
            missing=i;
        }
    }
        return new int[]{repeated,missing};
    }
    

        
    }
