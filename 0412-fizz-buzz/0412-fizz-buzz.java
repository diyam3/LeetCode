class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fb = new ArrayList<>();
        int x = n;
        for (int i = 0; i < x; i++) {
            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                fb.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                fb.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                fb.add("Buzz");
            }

            else {
                fb.add(Integer.toString(i + 1));
            }
        }
        return fb;
    }
}