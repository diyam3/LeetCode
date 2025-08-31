class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        int l = Integer.toBinaryString(num).length();
        int n = (1 << l) - 1;
        return num ^ n;
    }
}