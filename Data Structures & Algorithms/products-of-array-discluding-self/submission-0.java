class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int prefix = 1;
        for(int i = 0; i < len;i++){
            result[i] = prefix;
            prefix *= nums[i]; 
        }

        int suffix = 1;
        for(int i = len - 1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }      

        return result;  
    }
}
