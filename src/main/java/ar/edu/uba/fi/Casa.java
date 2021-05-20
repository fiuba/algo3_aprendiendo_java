package ar.edu.uba.fi;

import java.util.Objects;

public class Casa {
    private final String nombre;

    public Casa(String nombre) {

        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return nombre.toUpperCase().equals(casa.nombre.toUpperCase());
    }

    @Override
    public int hashCode() {


        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
