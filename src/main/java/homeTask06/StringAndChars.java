package homeTask06;

public class StringAndChars {
    public int findSymbolOccurrence(String string, char character) {
        int result = 0;
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (c == character) result++;
        }
        return result;
    }

    public int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        } else return -1;
    }

    public String stringReverse(String source) {
        char[] chars = source.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public boolean isPalindrome(String source) {
        return source.equals(stringReverse(source));
    }
}
