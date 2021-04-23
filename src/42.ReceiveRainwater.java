public class ReceiveRainwater{
    public int trap(int[] height) {
        int len = height.length;
        int[] left_max = new int[len];
        int[] right_max = new int[len];
        for(int i=1;i<len-1;i++){
            int temp_left_max = 0;
            for(int j=i-1;j>=0;j--){
                temp_left_max = Math.max(temp_left_max,height[j]);
            }
            int temp_right_max = 0;
            for(int j=i+1;j<len;j++){
                temp_right_max = Math.max(temp_right_max,height[j]);
            }
            left_max[i] = temp_left_max;
            right_max[i] = temp_right_max;
        }
        int res = 0;
        for(int i=1;i<len-1;i++){
            int max_height = Math.min(left_max[i],right_max[i]);
            res += height[i]<max_height?max_height-height[i]:0;
        }
        return res;
    }
}