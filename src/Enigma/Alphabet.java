package Enigma;

public class Alphabet {

    public static final String ALPHA_UP_WITH_SPACE="ABCDEFGHIJKLMNOUPRSTWYZ ";
    public static final String ALPHA_DOWN="abcdefghijklmouprstwyz";
    public static final String DIGITS="123456789";

    private String charSet = " ";

    public String getCharSet() {
        return charSet;
    }

    public Alphabet(String charSet) {
        this.charSet = charSet;
    }

    boolean isTextValid(String text) {
        return text.matches("^[" + charSet + "]+$");
    }

    public int indexOf(int ch){
        return charSet.indexOf(ch);
    }

    public int length() {
        return charSet.length();
    }

    public int charAt(int idx) {
        return charSet.charAt(idx);
    }
}
