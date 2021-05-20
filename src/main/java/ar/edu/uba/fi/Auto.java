package ar.edu.uba.fi;

import java.util.Objects;

public class Auto {
    private final String marca;

    public Auto(String marca) {

        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return marca.toUpperCase().equals( auto.marca.toUpperCase() );
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
