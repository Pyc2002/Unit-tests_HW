package five;

import five.number.MaxNumberModule;
import five.number.RandomNumberModule;
import org.junit.jupiter.api.Test;
import seminars.first.Main;


import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MainTest {
    //5.1. Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
    //максимальное число в этом списке.
    //Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
    //тест, который проверяет, что оба модуля работают вместе правильно

    @Test
    void RandomNumberTest(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();

        assertThat(randomNumberModule.randomArray(10).length).isEqualTo(10);
    }

    @Test
    void maxNumberTest(){
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        int[] numbers = {5,6,7,8,9,1,8};

        assertEquals(9, maxNumberModule.maxNumber(numbers));
    }

    @Test
    void integrationTest(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        int[] nums = randomNumberModule.randomArray(5);
        int maxNum = maxNumberModule.maxNumber(nums);

        Arrays.sort(nums);
        assertThat(maxNum).isEqualTo(nums[nums.length-1]);
    }

    //5.2.

    //5.3.
}