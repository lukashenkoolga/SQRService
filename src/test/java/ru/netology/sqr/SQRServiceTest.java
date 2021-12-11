package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSquaresCalculate() {
        SQRService service = new SQRService();

        int from = 200;
        int past = 300;
        int expected = 3;

        int actual = service.squaresCalculate(from, past);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBoundaryValueOfSquareOfMinimumNumbers() {
        SQRService service = new SQRService();

        int from = 100;
        int past = 300;
        int expected = 8;

        int actual = service.squaresCalculate(from, past);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBoundaryValueOfSquareOfMaximumNumbers() {
        SQRService service = new SQRService();

        int from = 600;
        int past = 9801;
        int expected = 75;

        int actual = service.squaresCalculate(from, past);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumbersOfSquare() {
        SQRService service = new SQRService();

        int from = 115;
        int past = 120;
        int expected = 0;

        int actual = service.squaresCalculate(from, past);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumbersOfAllSquar() {
        SQRService service = new SQRService();

        int from = 100;
        int past = 9801;
        int expected = 90;

        int actual = service.squaresCalculate(from, past);

        assertEquals(expected, actual);
    }


}