class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int l = candies.length;
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i = 0; i < l; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}