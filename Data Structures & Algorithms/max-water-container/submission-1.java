class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right= heights.length-1;
        int max=0;
        while(left < right){

            int he =right - left;
            int width =Math.min(heights[right], heights[left]);
            int area = he * width;
            max= Math.max(area, max);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }

        }
        
        return max;
    }
}
