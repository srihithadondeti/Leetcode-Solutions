class Solution {
    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[128];
        for (char vowel : "aeiouAEIOU".toCharArray()) {
            isVowel[vowel] = true;
        }
        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            while (left < right && !isVowel[characters[left]]) {
                left++;
            }
            while (left < right && !isVowel[characters[right]]) {
                right--;
            }
            if (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(characters);
    }
}