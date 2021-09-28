package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public long findMaxSales(long[] sales) {
        int maxMonth = 0;
        int currentMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = currentMonth;
            }
            currentMonth += 1;
        }
        return maxMonth + 1;
    }

    public long findMinSales(long[] sales) {
        int minMonth = 0;
        int currentMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = currentMonth;
            }
            currentMonth += 1;
        }
        return minMonth + 1;
    }

    public long findMonthsUnderAverage(long[] sales) {
        long average = calculateAverage(sales);
        long counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public long findMonthsOverAverage(long[] sales) {
        long average = calculateAverage(sales);
        long counter = 0;
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
