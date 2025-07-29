class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int l = s1.length();
        char ch;
        String str = "", newstr = "";
        for (int i = 0; i < l; i++) {
            ch = s1.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str = str + ch;
            }
        }
        int newl = str.length();
        char newch;
        for (int j = newl - 1; j >= 0; j--) {
            newch = str.charAt(j);
            newstr = newstr + newch;
        }
        return str.equals(newstr);
    }
}