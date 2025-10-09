class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int rev = 27 - (c - 'a' + 1);
            sum += rev * (i + 1);
        }
        return sum;
    }
}