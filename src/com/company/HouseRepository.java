package com.company;

import com.company.House;
import com.company.Door;
import com.company.Window;

import java.util.ArrayList;

public class HouseRepository {
    private ArrayList<House> houses;

    public HouseRepository(ArrayList<House> houses) {
        this.houses = houses;
    }

    public House getHouse() {
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getClass().equals(House.class)) {
                return (House) houses.get(i);
            }
        }
        return null;
    }
}
