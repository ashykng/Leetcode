class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder trimmedStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                trimmedStr.append(Character.toLowerCase(c));
            }}
        String forwardStr = trimmedStr.toString();
        String reversedStr = trimmedStr.reverse().toString();
        return forwardStr.equals(reversedStr);
    }
}