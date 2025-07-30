class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int l=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<l; i++)
        list.add(index[i],nums[i]);
        int target[]=new int[list.size()];
        for(int i=0; i<list.size(); i++)
        target[i]=list.get(i);
        return target;
    }
}