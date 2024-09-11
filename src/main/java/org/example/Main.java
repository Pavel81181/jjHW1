package org.example;


//Напишите программу, которая использует Stream API для обработки списка чисел.
//Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);

      OptionalDouble average = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Среднее значение четных чисел в списке:" + average);

    }
}