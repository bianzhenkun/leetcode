class SearchOnSwapArray {
    public int search(int[] nums, int target) {
        if(nums[0]==target) return 0;
        else if(nums[nums.length-1]==target) return nums.length-1;
        else if(nums[0]<target){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target) return i;
            }
        }else if(nums[nums.length-1]>target){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target) return i;
            }
        }
        return -1;
    }
}
//1 2 3 4
//3 4 1 2