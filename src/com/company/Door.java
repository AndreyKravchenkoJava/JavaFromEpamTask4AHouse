package com.company;

import java.util.Objects;

public class Door extends Window{
    private int numbersDoors;

    public Door(int numbersWindows, int numbersDoors) {
        super(numbersWindows);
        this.numbersDoors = numbersDoors;
    }

    public int getNumbersDoors() {
        return numbersDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Door door = (Door) o;
        return Objects.equals(numbersDoors, door.numbersDoors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbersDoors);
    }

    @Override
    public String toString() {
        return super.toString() + "Door: numbersDoors= " + numbersDoors;
    }
}
