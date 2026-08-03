class Solution {
    public int rob(int[] nums) {
         if (nums.length == 1) {
            return nums[0];
        }

        // Create two arrays
        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];

        // Fill the arrays
        for (int i = 0; i < nums.length - 1; i++) {
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }

        // Rob both possibilities
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);

        // Return maximum loot
        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    private int robHelper(int[] nums) {

    int n = nums.length;

    if (n == 1)
        return nums[0];

    int[] dp = new int[n];

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
    }

    return dp[n - 1];
}
    }

