package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class UsoDeAssertions
{
    @Test
    public void dosNumerosDebenSerIguales()
    {

        // equivalente a `self assert:`
        assertEquals(2, 2);

    }

    @Test
    public void dosStringsDebenSerIguales()
    {

        // equivalente a `self assert:`
        assertEquals("Algoritmos y Programación", "Algoritmos y Programación");
        assertNotEquals("Algoritmos y ProgramacióN", "Algoritmos y Programación");
    }

    @Test
    public void esCaseSensitive()
    {

        // se ejecuta método _boolean equals(Object o)_
        assertNotEquals("ABC", "abc");
        assertEquals("ABC", "abc".toUpperCase());

    }

    @Test
    public void dosObjetosSonIguales()
    {

        Casa unaCasa = new Casa("pepa");
        Casa otroCasa = new Casa("PEPA");

        assertEquals(unaCasa, otroCasa);

        assertSame(unaCasa, unaCasa);
        assertNotSame(unaCasa, otroCasa);

    }

    @Test
    public void dosObjetosSonElMismo()
    {

        Casa unaCasa = new Casa("pepa");
        Casa laMismaCasa = unaCasa;
        Casa otroCasa = new Casa("PEPA");

        assertSame(unaCasa, laMismaCasa);
        assertNotSame(unaCasa, otroCasa);

    }

    @Test
    public void seProdujoUnError() {

        Executable task = () -> {
            throw new UnknownError();
        };

        // self should: [ task() ] raise: UnknownError.
        assertThrows(UnknownError.class, task);

        // self shouldnt: [ task() ] raise: UnknownError.
        assertDoesNotThrow(() -> {
            System.out.println();
        });

    }


}
