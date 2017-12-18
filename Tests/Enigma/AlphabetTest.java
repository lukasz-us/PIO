package Enigma;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    Alphabet a;

    @BeforeEach //uruchamia tą metodę przed każdym testem
    public void setUp(){
        a = new Alphabet("ABCDE");
    }

    @Test
    public void nullCharsetTest(){
        assertThrows(IllegalArgumentException.class,()->{new Alphabet(null);},"Null jako alfabet");
    }

    @Test
    public void emptyCharsetTest() {
        assertThrows(IllegalArgumentException.class,()->{new Alphabet(null);},"Brak alfabetu");
    }

    @Test
    public void lengthTest() {
        assertEquals(5,a.length());
    }

    @Test
    public void getCharSetTest() {
    }

    @Test
    public void isTextValidTest() {
    }

    @Test
    public void indexOfUndefinedCharTest() {
        assertThrows(IllegalArgumentException.class,()->{a.indexOf('X');},"Znak z poza zakresu");
    }

    @Test
    public void charAtLenghtExtendedTest() {
        assertEquals('A',a.charAt(0));
    }

    @Test
    public void charAtIndexNegativeTest() {
        assertEquals('A',a.charAt(10));
    }

    @Test
    public void charAtIndexNegativeLenghtExtendedTest() {
        assertEquals('E',a.charAt(-6));
    }
}