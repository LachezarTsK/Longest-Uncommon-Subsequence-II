public class Solution {

    public int findLUSlength(String[] strs) {

        int maxLength = -1;
        for (int index_one = 0, index_two; index_one < strs.length; index_one++) {
            for (index_two = 0; index_two < strs.length; index_two++) {
                if (index_one != index_two && isSubsequence(strs[index_one], strs[index_two])) {
                    break;
                }
            }

            if (index_two == strs.length) {
                maxLength = Math.max(maxLength, strs[index_one].length());
            }

        }
        return maxLength;
    }

    public boolean isSubsequence(String one, String two) {
        int index_one = 0;
        for (int index_two = 0; index_two < two.length() && index_one < one.length(); index_two++) {
            if (one.charAt(index_one) == two.charAt(index_two)) {
                index_one++;
            }
        }
        return index_one == one.length();
    }
}
