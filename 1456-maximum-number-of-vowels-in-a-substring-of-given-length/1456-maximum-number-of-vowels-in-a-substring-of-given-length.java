class Solution {
    public int maxVowels(String s, int k) {
        int start = 0, end = 0, count = 0, maxCount = 0;
        while (end < s.length()) {
            // windows expand
            if (isVowel(s.charAt(end++))) {
                count++;
            }
            //  windows cutting
            while (start < end && end - start > k) {
                if (isVowel(s.charAt(start++))) {
                    count--;
                }
            }
            // operation perform
            if (end - start == k) {
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;

        }
        return false;
    }
}