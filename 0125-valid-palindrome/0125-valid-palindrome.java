class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)) str+=ch;
        }
        //String st=str;
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev)) return true;
        return false;
    }
}