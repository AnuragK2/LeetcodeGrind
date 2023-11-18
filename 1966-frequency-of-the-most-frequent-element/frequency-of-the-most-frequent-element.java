class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int L = 0;
        int R = 0;
        long totalSum = 0;
        int ans = 0;

        for (R = 0; R < nums.length; R++) {
            totalSum += nums[R];
            while (nums[R] * (R - L + 1) > totalSum + k) {
                //sum can't be achieved in K moves, hence shrink the window
                totalSum -= nums[L];
                L++;
            }
            //expand the window
            ans = Math.max(ans, R - L + 1);
        }
        return ans;
    }
}
