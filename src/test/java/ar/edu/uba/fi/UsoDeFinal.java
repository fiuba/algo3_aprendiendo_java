package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsoDeFinal {

    private final ArrayList<Integer> enteros = new ArrayList(Arrays.asList(1,2,3));

    @Test
    public void enterosContieneElUnoDos() {

        assertTrue( enteros.contains(1));
        assertTrue( enteros.contains(2));
    }

    @Test
    public void alteroLaColeccionLuegoPruebo() {

        // Esto no lo permite el compilador
        // enteros = new ArrayList<>();

        enteros.add(9);
        assertTrue( enteros.contains(9));
    }
}
