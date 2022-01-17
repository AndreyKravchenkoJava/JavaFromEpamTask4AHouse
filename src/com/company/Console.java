package com.company;

import com.company.House;
import com.company.Door;
import com.company.Window;
import com.company.HouseRepository;
import com.company.HouseService;

import java.util.Scanner;

public class Console {
    private HouseService houseService;
    private House house;
    private Scanner scanner;

    public Console(HouseService houseService, House house) {
        this.houseService = houseService;
        this.house = house;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "c" : {
                runMethodGetCloseTheKay();
                break;
            }
            case "d" : {
                runMethodGetNumbersDoors();
                break;
            }
            case "w" : {
                runMethodGetNumbersWindows();
                break;
            }
            case "x" : {
                System.out.println("Thanks for using this program. Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("Your input wrong choice!");
            }
        }
    }

    private void runMethodGetCloseTheKay() {
        String close = house.getCloseWithTheKey();
        System.out.println("House : " + close);
    }
    private void runMethodGetNumbersDoors() {
        int doors = house.getNumbersDoors();
        System.out.println("Numbers of doors : " + doors);
    }
    private void runMethodGetNumbersWindows() {
        int windows = house.getNumbersWindows();
        System.out.println("Numbers of windows : " + windows);
    }
    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void helloMessage() {
        System.out.println("------------------------------------");
        System.out.println("c - close the key");
        System.out.println("d - numbers of doors");
        System.out.println("w - numbers of windows");
        System.out.println("x - exit");
    }
}
