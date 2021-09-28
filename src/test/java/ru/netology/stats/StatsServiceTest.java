package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private final long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
      StatsService service = new StatsService();

      long expected = 180;

      long actual = service.calculateSum(sales);

      assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.findMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.findMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthsUnderAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.findMonthsUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthsOverAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.findMonthsOverAverage(sales);

        assertEquals(expected, actual);
    }
}