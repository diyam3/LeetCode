class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            if (i < s.length() - 1 && romanMap.get(s.charAt(i + 1)) > currentValue) {
                // If so, it's a subtraction case (e.g., IV, IX, XL, XC, CD, CM)
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }
        return total;

    }
}