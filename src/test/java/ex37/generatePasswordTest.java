package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class generatePasswordTest {

    @Test
    void getLength() {
        generatePassword test = new generatePassword();
        test.setLength(8);
        assertEquals(8, test.getLength());
    }

    @Test
    void getNumber() {
        generatePassword test = new generatePassword();
        test.setNumber(2);
        assertEquals(2, test.getNumber());
    }

    @Test
    void getSpecial() {
        generatePassword test = new generatePassword();
        test.setSpecial(2);
        assertEquals(2, test.getSpecial());
    }
}