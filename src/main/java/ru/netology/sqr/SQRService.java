package ru.netology.sqr;

public class SQRService {
    public int squaresCalculate(int from, int past) {
        int counter = 0;

        for (int i = 10; i <= 99; i++  ) {

            if (i * i >= from && i * i <= past){
                counter = counter +1;
            }
        }
        return counter;
    }
}