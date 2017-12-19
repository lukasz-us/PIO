package Enigma;

public class Main {

    public static void main(String[] args) {

        Alphabet alphabet = new Alphabet(Alphabet.ALPHA_UP_WITH_SPACE);

        Cipher cipher = new Cipher(alphabet);

        String in = "ABCD";

        System.out.println(alphabet.isTextValid(in));
        in=cipher.encrypt(in);
        System.out.println(in);
        in=cipher.decrypt(in);
        System.out.println(in);

    }
}