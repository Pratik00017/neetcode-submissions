class Solution {
    public int maxArea(int[] heights) {

        int left=0; 
        int right=heights.length-1;
        int total=0;


        while(left < right){
            int h = right - left;
            int minn = Math.min(heights[left], heights[right]);
            int totall = h * minn;
            total=Math.max(total, totall);

            if(heights[left]< heights[right]){
                left++;

            }
            else{
                right--;
            }

            }
            return total;
        
        
    }
    
}
