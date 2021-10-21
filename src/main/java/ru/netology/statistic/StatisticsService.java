package ru.netology.statistic;

public class StatisticsService {

    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes) {
            if (income >= current_max)
                current_max = income;
        }
        return current_max;
    }

    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes) {
            if (current_min >= income)
                current_min = income;
        }
        return current_min;
    }

    public long findAver(long[] incomes) {
        long average_index = 0;
        for (long income : incomes)
            average_index = income + average_index;
        return ((average_index) / incomes.length);
    }

    public long findSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes)
            sum += income;
        return sum;
    }

    public int countAboveAver(long[] incomes) {
        int count = 0;
        for (long income : incomes) {
            if (income > findAver(incomes)) {
                count++;
            }
        }
        return count;
    }

    public int countBelowAver(long[] incomes) {
        int count = 0;
        for (long income : incomes) {
            if (income < findAver(incomes)) {
                count++;
            }
        }
        return count;
    }
}

