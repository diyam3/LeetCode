class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int d, s = 0;
            while (num != 0) {
                d = num % 10;
                s++;
                num = num / 10;
            }
            if (s % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}