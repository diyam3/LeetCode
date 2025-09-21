class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int ans = 0;
        int [] element = new int [n];
        for(int i = 0; i < n; i++){
            element[i] = nums.get(i);
        }
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if(element[i] + element[j] < target){
                    ans++;
                }
            }
        }
        return ans;
    }
}