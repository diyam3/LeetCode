class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y = 0;
        int z = x;
        while(x!=0){
            y += x%10;
            x /=10;
        }
        if(z%y==0) return y;
        return -1;
    }
}