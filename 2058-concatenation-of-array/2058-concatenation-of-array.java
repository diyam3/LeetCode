class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[2 * l];
        int c = 0;
        for (int i = 0; i < (2 * l); i++) {
            if (i > (l - 1)) {
                ans[i] = nums[c];
                c += 1;
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}