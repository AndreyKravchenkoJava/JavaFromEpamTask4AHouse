package com.company;

import com.company.House;
import com.company.Door;
import com.company.Window;
import com.company.HouseRepository;

public class HouseService {
    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House getHouse() {
        return houseRepository.getHouse();
    }
}
