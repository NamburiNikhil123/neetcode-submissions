class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int i = 0;
        int j = height.length - 1;

        int result = 0;

        while (i < j) {
            int left = height[i];
            int right  = height[j];
            leftMax = Math.max(left,leftMax);
            rightMax =  Math.max(right, rightMax);

            result += (leftMax - left) + (rightMax - right);

            if(left<=right){
                i++;
            } else{
                j--;
            }
        }

        return result;
    }
}
