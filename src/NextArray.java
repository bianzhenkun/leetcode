class NextArray {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //找到最右面的较小数
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //i<0说明为最大了，只需要返回最小的
        if (i >= 0) {
            int j = nums.length - 1;
            //找到最右面的较大数，也就是比nums[i]大的最少的数nums[j]
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }   
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}