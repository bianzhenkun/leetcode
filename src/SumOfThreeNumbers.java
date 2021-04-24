class SumOfThreeNumbers {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<3) return res;
        Arrays.sort(nums);
        if(nums[0]>0 || nums[nums.length-1]<0) return res;
        int index = 0;
        //-4 -2 -1 -1 0 1 2
        while(index<nums.length-2){
            int left = index+1, right = nums.length-1;
            while(left<right){
                int sum = nums[index]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[index],nums[left],nums[right])));
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
            while(index<nums.length-2 && nums[index]==nums[index+1]) index++;
            index++;
        }
        return res;
    }
}