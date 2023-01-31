package ru.netology.stats.mavenjohn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.mavenjohn.services.StatsService;


public class StatsServiceTest {

    @Test
    public void test() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = 9;
        long actualSales = service.minSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test

    public void testMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = 8;
        long actualSales = service.maxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void testAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =  180;
        long actual = service.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =  5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  AboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
