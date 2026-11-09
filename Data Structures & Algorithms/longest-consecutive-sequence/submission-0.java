class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int len = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            int next = nums[i + 1];

            if (curr + 1 == next) {
                len++;
            } else if (curr == next) {
                continue;
            } else {
                max = Math.max(len, max);
                len = 1;
            }
        }
        return Math.max(len, max);
    }
}
