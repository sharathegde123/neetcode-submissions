class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>ansSet=new HashSet<>();
        for(int n:nums1)
        set1.add(n);
        for(int n:nums2)
        if(set1.contains(n)){
        ansSet.add(n);
    }
    int[] ans=new int[ansSet.size()];
    int i=0;
    for(int n:ansSet)
        ans[i++]=n;
        return ans;

        }

    }

