class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] st : matrix){
            int left=0;
             int right=st.length - 1;
             while(left <= right){
                int mid = (right + left) / 2;
                if(st[mid] == target){
                    return true;
                }
                else if(st[mid] < target){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
                
             }
        }
        return false;
    }
}
