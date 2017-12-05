package Enigma;

public class Main {

    public static void main(String[] args) {

        Alphabet alphabet = new Alphabet(Alphabet.ALPHA_UP_WITH_SPACE);

        Cipher cipher = new Cipher(alphabet);

        String in = "ABC ";

        System.out.println(alphabet.isTextValid(in));

        System.out.println(cipher.encrypt(in));

    }
}