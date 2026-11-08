class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, window)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            int left = i - s1.length();

            window[s2.charAt(left) - 'a']--;
            window[s2.charAt(i) - 'a']++;
            if (Arrays.equals(s1Count, window)) {
                return true;
            }
        }
        return false;
    }
}
