package com.company;

import java.util.Objects;

public class Window {
    private int numbersWindows;

    public Window(int numbersWindows) {
        this.numbersWindows = numbersWindows;
    }

    public int getNumbersWindows() {
        return numbersWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(numbersWindows, window.numbersWindows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbersWindows);
    }

    @Override
    public String toString() {
        return "Window: numbersWindows= " + numbersWindows;
    }
}
