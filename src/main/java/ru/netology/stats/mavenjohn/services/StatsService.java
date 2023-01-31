package ru.netology.stats.mavenjohn.services;
public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {


            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long amountSales(long[] sales) {
        long amount = 0;

        for (long sale : sales) {

            amount += sale;

        }
        return amount;
    }

    public long average(long[] sales) {
        return amountSales(sales) / sales.length;
    }


    public int belowAverageSales(long[] sales) {

        int counter = 0;

        for (long sale : sales) {


            if (sale < average((sales))) {


                counter++;
            }
        }
        return counter;
    }

    public int aboveAverageSales(long[] sales) {

        long averageSail = average(sales);

        int counter = 0;

        for (long sale : sales) {


            if (sale > averageSail) {

                counter++;
            }
        }
        return counter;
    }

}
