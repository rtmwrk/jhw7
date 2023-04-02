package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    // 1-й элемент массива и содержит самое большое значение,
    // условие "currentMax < income" не получает значение "истина",
    // посему строка № 8 сервисного класса не отрабатывается вообще
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Протестируем класс на работу, когда элемент с максимальным значением
    // будет не первым в массиве, для чего изменим значение 0-го элемента массива.
    // Єто приведет к отработке ветки сервисного класса "if (currentMax < income)..."
    @Test
    void findMaxIfCurrentMaxLessIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}