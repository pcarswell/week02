package com.pete.week02;

public class Main {

    public static void main(String[] args) {
        int FREEZING = 32;
        int PRECIP = 50;
        int [] temperatures = {45, 29,10, 22, 48, 28, 32};
        int [] precipitation = {95, 60, 25, 5, 0, 75, 90};

        String [] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (int index = 0; index < daysOfWeek.length; index++) {
            if ((temperatures[index] < FREEZING) && (precipitation[index] > PRECIP)) {
                System.out.println("Put on your Mucklucks! It's likely to snow on " + daysOfWeek[index]);
            }
        }
    }
}
