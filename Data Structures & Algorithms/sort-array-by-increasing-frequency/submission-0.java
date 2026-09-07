class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int fi=0;
                int fj=0;
                for(int k=0;k<n;k++)
                    if(nums[k]==nums[i])
                        fi++;
                for(int k=0;k<n;k++)
                    if(nums[k]==nums[j])
                        fj++;
                if(fi>fj||(fi==fj && nums[i]<nums[j])){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                }
        }
                return nums;
        }

        }
