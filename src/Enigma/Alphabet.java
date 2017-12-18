package Enigma;

public class Alphabet {

    public static final String ALPHA_UP_WITH_SPACE = "ABCDEFGHIJKLMNOUPRSTWYZ ";
    public static final String ALPHA_DOWN = "abcdefghijklmouprstwyz";
    public static final String DIGITS = "123456789";
    private int lenght;

    private String charSet = " ";

    public String getCharSet() {
        return charSet;
    }

    public Alphabet(String charSet) {
        if (charSet == null || charSet.isEmpty()){
            throw new IllegalArgumentException("Brak alfabetu");
        }
        this.charSet = charSet;
        this.lenght=charSet.length();
    }

    boolean isTextValid(String text) {
        return text.matches("^[" + charSet + "]+$");
    }

    public int indexOf(int ch) {
        int i = charSet.indexOf(ch);
        if(i == -1){
            throw new IllegalArgumentException("Znak spoza alfabetu");
        }
        return i;
    }

    public int length() {
        return charSet.length();
    }

    public int charAt(int idx) {
        if(idx >= 0){
            idx = idx % lenght;
        } else {
            idx = (lenght + idx % lenght) % lenght;
        }
        return charSet.charAt(idx);
    }
}
