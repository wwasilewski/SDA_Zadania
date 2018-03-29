//Przygotuj metodę sprawdzającą czy podany przez użytkownika obiekt nie jest
//null korzystając z obiektu Optional.
//Podpowiedź: Wykorzystaj metodę ofNullable oraz isPresent.

package Programowanie1.tydzien4.Zadania013Optional.ex01;

import org.junit.Test;

import static org.junit.Assert.*;

public class NullCheckerTest {

    @Test
    public void checkIfNullWithOptional() {
        NullChecker nc = new NullChecker();
        assertTrue("method does not work correctly", nc.whenNullReturnFalse("text"));
        assertTrue("method does not work correctly", nc.whenNullReturnFalse(467));
        assertFalse("method does not work correctly", nc.whenNullReturnFalse(null));
    }
}
