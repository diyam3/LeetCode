class Solution {
    public int mostWordsFound(String[] sentences) {
        int mLen = 0;
        for (String curr : sentences) {
            int cLen = curr.split(" ").length;
            if (mLen < cLen)
                mLen = cLen;
        }
        return mLen;
    }
}