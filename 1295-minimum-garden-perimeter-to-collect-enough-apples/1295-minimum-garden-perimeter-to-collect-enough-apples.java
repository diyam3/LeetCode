class Solution {
    public long minimumPerimeter(long neededApples) {
        long lo = 1, hi = 100_000;
        while (lo < hi) {
            long mid = lo + hi >> 1;
            if (2 * mid * (mid + 1) * (2 * mid + 1) < neededApples) {
                lo = mid + 1;
            }else {
                hi = mid;
            }
        }
        return 8 * hi;
    }
}