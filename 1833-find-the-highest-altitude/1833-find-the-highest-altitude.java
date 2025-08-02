class Solution {
    public int largestAltitude(int[] gain) {
        int [] alt = new int[gain.length+1];
        alt[0] =0;
        for(int i =0;i<gain.length;i++){
            alt[i+1] = alt[i] + gain[i];
        }
        int highest = findHighest(alt);
        return highest;
    }
    static int findHighest(int[] arr){
        int high = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>high){
                high = arr[i];
            }
            
        }
        return high;
    }
}