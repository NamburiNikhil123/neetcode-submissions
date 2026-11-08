class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxFrequency = 0;
 
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(curr));

            while((right - left + 1) - maxFrequency > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}
