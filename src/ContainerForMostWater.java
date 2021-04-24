class ContainerForMostWater {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1;
        int res = Math.min(height[left], height[right])*(right-left);
        while(left<=right){
            res = Math.max(res, Math.min(height[left], height[right])*(right-left));
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}