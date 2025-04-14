package stepik.abstruct.asciichar;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
    private byte[] ascii;

    public AsciiCharSequence(byte[] ascii) {
        this.ascii = ascii;
    }

    @Override
    public int length() {
        return ascii.length;
    }

    @Override
    public char charAt(int index) {
        return (char) ascii[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(ascii, start, end));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (byte b : ascii) {
            stringBuilder.append(b);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
