package com.Zinchenko.homework.exception;

//        Ознакомиться с методом
//        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String)
//
//        1. Создать класс ArrayValueCalculator
//
//        2. Создать метод doCalc. На вход методу подаётся двумерный строковый массив размером 4х4.
//
//        3. При передаче массива другого размера в метод doCalc,
//        необходимо выбросить исключение MyArraySizeException.
//
//        4. Метод doCalc должен пройтись по всем элементам массива и преобразовать
//        в int (использовать Integer#parseInt) и просуммировать. После общего суммирования, метод возвращает финальный результат в виде int.
//
//        5.Если в каком-то элементе массива преобразование не удалось (например,
//        в ячейке лежит символ или текст вместо числа), тогда быть выброшено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//
//        6. В методе main() вызвать полученный метод, обработать возможные исключения
//        MySizeArrayException и MyArrayDataException, и вывести результат расчета.
//
//        7. * Необходимо соблюдать все правила сохранения контекста выброшенного исключения.
//
//        8. * При отлове исключений в процессе преобразования, принять во внимание исключения выбрасываемые другими (сторонними) мето

import java.util.Arrays;

public class ArrayValurCalculator {
    public static void main(String[] args) {


        String[][] arrays = new String[][]{{"5", "8", "78", "2"},
                                           {"3", "9", "2", "7"},
                                           {"1", "1", "2", "2"},
                                           {"9", "34", "8", "2"}};

        String[][] arrays2 = new String[][]{{"5", "8", "78", "2"},
                                            {"3", "9", "2", "7"},
                                            {"1", "1", "2", "2"},
                                            {"9", "j", "8", "2"}};

        try {
            System.out.println(doCalс(arrays));
            System.out.println(doCalс(arrays2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }


    public static int doCalс(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Wrong size arrays!!!!!");

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Wrong size!!!");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Wrong data!!! : [" + i + "][" + j + "]" + " in " + e);

                }

            }
        }return result;

    }
}

