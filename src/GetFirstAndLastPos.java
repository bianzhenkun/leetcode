class GetFristAndLastPos {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0 || nums==null) return new int[]{-1,-1};
        int left = 0, right = nums.length-1;
        int index = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]){
                 index = mid;
                 break;
            }
            else if(target<nums[mid]) right = mid-1;
            else left = mid+1;
        }
        if(nums[index]!=target) return new int[]{-1,-1};
        int start = index, end =index;
        while(start>=0 && nums[start]==nums[index]) start--;
        while(end<=nums.length-1 && nums[end]==nums[index]) end++;
        return new int[]{start+1,end-1};
    }
}