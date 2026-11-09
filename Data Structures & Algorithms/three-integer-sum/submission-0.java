class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int left = 0; left < nums.length; left++) {
            if (left > 0 && nums[left] == nums[left - 1]) {
                continue;
            }
            int mid = left + 1;
            int right = nums.length - 1;
            while (mid < right) {
                int sum = nums[left] + nums[mid] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    mid++;
                } else {
                    result.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    mid++;
                    right--;
                }
            }
        }

        return result;
    }
}
