package com.example.unitcoverter;

public class Converter {
    public static float toCelcius(float fah) {
        return (fah - 32) * 5 / 9;
    }

    public static float toKilograms(float lbs) {
        return (float) (lbs * 0.45359237);
    }
}
