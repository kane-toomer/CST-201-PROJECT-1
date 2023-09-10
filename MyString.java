public class MyString {
    private char[] chars;
    private int curr_length;

    // My constructor
    public MyString() {
        chars = null;
        curr_length = 0;
    }

    // Constructor takes a String param & init char arr & curr_length
    // O(n) because we iterate through the input string once.
    public MyString(String str) {
        curr_length = str.length();
        chars = new char[curr_length];
        for (int i = 0; i < curr_length; i++) {
            chars[i] = str.charAt(i);
        }
    }

    // Copying my constructor
    // O(n) because we iterate through the input string once.
    public MyString(MyString other) {
        curr_length = other.curr_length;
        chars = new char[curr_length];
        System.arraycopy(other.chars, 0, chars, 0, curr_length);
    }

    // length Method
    // O(1) because we are just returning a value
    public int length() {
        return curr_length;
    }

    // ensuringCapacity Method
    // O(n) because we are just resizing the number of characters to be copied
    private void ensureCapacity(int minCapacity) {
        if (chars == null) {
            chars = new char[Math.max(16, minCapacity)];
        } else if (chars.length < minCapacity) {
            char[] newChars = new char[Math.max(chars.length * 2, minCapacity)];
            System.arraycopy(chars, 0, newChars, 0, curr_length);
            chars = newChars;
        }
    }

    // toString Method
    // O(n) because we only process each character once
    @Override
    public String toString() {
        return new String(chars, 0, curr_length);
    }

    // concat Method
    // O(n) because it iterates through each character in both strings up to the
    // length of the shorter string.
    public MyString concat(MyString other) {
        MyString result = new MyString();
        result.ensureCapacity(curr_length + other.curr_length);
        System.arraycopy(chars, 0, result.chars, 0, curr_length);
        System.arraycopy(other.chars, 0, result.chars, 0, curr_length);
        result.curr_length = curr_length + other.curr_length;
        return result;
    }

    // equals Method
    // O(n) because it iterates through each character in both strings up to the
    // length of the shorter string.
    public boolean equals(MyString other) {
        if (other == null || curr_length != other.curr_length) {
            return false;
        }
        for (int i = 0; i < curr_length; i++) {
            if (chars[i] != other.chars[i]) {
                return false;
            }
        }
        return true;
    }

    // compareTo Method
    // O(n) because it iterates through each char in both strings up to the length
    // of the shorter string.
    public int compareTo(MyString other) {
        int minLength = Math.min(curr_length, other.curr_length);
        for (int i = 0; i < minLength; i++) {
            int diff = chars[i] - other.chars[i];
            if (diff != 0) {
                return diff;
            }
        }
        return curr_length - other.curr_length;
    }

    // .get(int) Method
    // O(1) because it directly accesses the characters by the index
    public char get(int i) {
        if (i < 0 || i >= curr_length) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return chars[i];
    }

    // toUpper Method
    // O(n) because we only process each character once
    public MyString toUpper() {
        MyString result = new MyString(this);
        for (int i = 0; i < curr_length; i++) {
            result.chars[i] = Character.toUpperCase(chars[i]);
        }
        return result;
    }

    // toLower Method
    // O(n) because we only process each character once
    public MyString toLower() {
        MyString result = new MyString(this);
        for (int i = 0; i < curr_length; i++) {
            result.chars[i] = Character.toLowerCase(chars[i]);
        }
        return result;
    }

    // substring(int) Method
    // O(1) because it depends on the length of the substring being copied
    public MyString substring(int startIndex) {
        return substring(startIndex, curr_length);
    }

    // substring(int n, int m) Method
    // O(1) because it depends on the length of the substring being copied
    public MyString substring(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > curr_length || startIndex > endIndex) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        MyString result = new MyString();
        result.ensureCapacity(endIndex - startIndex);
        System.arraycopy(chars, startIndex, result.chars, 0, endIndex - startIndex);
        result.curr_length = endIndex - startIndex;
        return result;
    }

    // indexOf(MyString) Method
    // O(n^2) because as it grows it is squaring the input size
    public int indexOf(MyString substring) {
        for (int i = 0; i <= curr_length - substring.curr_length; i++) {
            boolean found = true;
            for (int j = 0; j < substring.curr_length; j++) {
                if (chars[i + j] != substring.chars[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    // lastIndexOf(MyString) Method
    // O(n^2) because as it grows it is squaring the input size
    public int lastIndexOf(MyString substring) {
        for (int i = curr_length - substring.curr_length; i >= 0; i--) {
            boolean found = true;
            for (int j = 0; j < substring.curr_length; j++) {
                if (chars[i + j] != substring.chars[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}