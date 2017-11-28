package Enigma;

public class Main {

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOUPRSTWYZ";
        String in = "ABCZ";

        StringBuilder out = new StringBuilder();

        for (int i = 0, len = in.length(); i < len; i++) {

            int ch = in.charAt(i);

            int idx = alphabet.indexOf(ch);

            idx = (idx + 1) % alphabet.length();

            ch = alphabet.charAt(idx);
            out.append((char) ch);
        }

        System.out.println(out);
    }
}