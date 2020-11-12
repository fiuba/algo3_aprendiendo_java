package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnaPruebaPilto {

    @Test
    public void unaPruebaTrivial() {

        // equivalente a `self assert:`
        assertTrue(true);

        // equivalente a `self deny:`
        assertFalse( 1 > 2);
    }
}
