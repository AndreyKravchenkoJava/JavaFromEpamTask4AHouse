package com.company;

import com.company.House;
import com.company.Door;
import com.company.Window;
import com.company.HouseRepository;
import com.company.HouseService;
import com.company.Console;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        House house = new House(10, 5, "House close the key", new ArrayList<>());

        HouseRepository houseRepository = new HouseRepository(house.getHouses());
        HouseService houseService = new HouseService(houseRepository);
        Console console = new Console(houseService, house);

        console.run();
    }
}
