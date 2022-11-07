package ru.netology.sqr.sqrtHomework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCountSqrt() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.sqrCount(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSqrtUnderBorder() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrCount(200, 300);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldCountSqrtNegative() {
        SQRService service = new SQRService();

        int expected = 10;
        int actual = service.sqrCount(-10, 99);

        Assertions.assertEquals(expected, actual);

    }
}
