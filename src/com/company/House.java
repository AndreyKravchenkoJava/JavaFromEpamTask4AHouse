package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class House extends Door{
    private String closeWithTheKey;
    private ArrayList<House> houses;

    public House(int numbersWindows, int numbersDoors, String closeWithTheKey, ArrayList<House> houses) {
        super(numbersWindows, numbersDoors);
        this.closeWithTheKey = closeWithTheKey;
        this.houses = houses;
    }

    public String getCloseWithTheKey() {
        return closeWithTheKey;
    }
    public ArrayList<House> getHouses() {
        return houses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        House house = (House) o;
        return Objects.equals(closeWithTheKey, house.closeWithTheKey) && Objects.equals(houses, house.houses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closeWithTheKey, houses);
    }

    @Override
    public String toString() {
        return super.toString() + "House: closeWithTheKey= " + closeWithTheKey + ", houses= " + houses;
    }
}
