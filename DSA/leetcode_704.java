class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>=target)
            {
                index=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        if(index!=-1 && nums[index]==target)
        {
            return index;
        }
        return -1;
    }
}
