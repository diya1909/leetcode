class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int rigth=nums.length-1;
        while(left<rigth){
            int mid=(left+rigth)/2;
            if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2==1 && nums[mid]==nums[mid-1])    left=mid+1;
            else rigth=mid;
        }
        return nums[left];
    }
}