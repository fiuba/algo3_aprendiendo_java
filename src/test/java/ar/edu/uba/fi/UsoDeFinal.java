package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsoDeFinal {

    // enteros -> @123


    // @123: [1,2,3]
    // @999: []
    private final ArrayList<Integer> enteros = new ArrayList(Arrays.asList(1,2,3));

    @Test
    public void enterosContieneElUnoDos() {

        assertTrue( enteros.contains(1));
        assertTrue( enteros.contains(2));

        assertFalse( enteros.contains(4));
    }

    @Test
    public void alteroLaColeccionLuegoPruebo() {

        // Esto no lo permite el compilador
        // enteros = new ArrayList<>();

        enteros.add(9);
        assertTrue( enteros.contains(9));
    }
}
