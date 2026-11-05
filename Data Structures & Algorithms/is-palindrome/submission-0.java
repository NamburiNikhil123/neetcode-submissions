class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (!isValid(s.charAt(i))) {
                i++;
                continue;
            }

            if (!isValid(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    boolean isValid(char ch) {
        return ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9');
    }
}
