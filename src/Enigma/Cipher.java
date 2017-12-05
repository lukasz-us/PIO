package Enigma;

public class Cipher {

    private Alphabet alphabet;

    private int key = 1;

    public Cipher(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt(String text) {

        if (!alphabet.isTextValid(text)){
            throw new IllegalArgumentException("Tekst zawiera znaki z poza alfabetu");
        }

        StringBuilder out = new StringBuilder();

        for (int i = 0, len = text.length(); i < len; i++) {

            int ch = text.charAt(i);

            int idx = alphabet.indexOf(ch);

            idx = (idx + 1) % alphabet.length();

            ch = alphabet.charAt(idx);
            out.append((char) ch);
        }

        return out.toString();
    }
}