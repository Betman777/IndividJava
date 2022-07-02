package com.Zinchenko.homework.oopColectionSet;

//1. Создать метод convertToUnique. Метод принимает строковый список заполненый произвольными значениями, которые могут повторяться.
//        Необходимо вернуться последовательность строк, но без учета повторений.
//        Например:
//        Дано: [Привет, Мир, Привет, !]
//        Будет хранить: [Привет, Мир, !]
//
//        2. Создать метод getSortedUniqueIntegersASC. Метод принимает на вход список целочисленных значений, заполненый произвольными значениями, которые могут повторяться. Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по возрастанию.
//
//        3. Создать метод getSortedUniqueIntegersDESC. Метод принимает на вход список целочисленных значений, заполненый произвольными значениями, которые могут повторяться. Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по убыванию.
//
//        4. * Создать метод buildSentenceDirection. Метод принимает на вход набор строковых значений, заполненый произвольными значениями, которые могут повторяться. Необходимо вернуться последовательность строковых значений, но без учета повторений, которые сохранят
//        последовательность вставки после создания такой последовательности.
//        Например:
//        Дано: [Привет, Мир, Привет, !, !]
//        Будет хранить значения в точной последовательности и никак иначе: [Привет, Мир, !]


import java.util.*;

public class OOPColection {
    public static void main(String[] args) {
// Первое задание
        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("Мир");
        stringList.add("Привет");
        stringList.add("!");
        convertToUnique(stringList);
        Collections.reverse(stringList);
        System.out.println(stringList);

        System.out.println("------------------------------");

        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(1);
        integersList.add(4);
        integersList.add(2);
        integersList.add(5);
        integersList.add(1);
        System.out.println(getSortedUniqueIntegersASC(integersList));

        System.out.println("------------------------------");
        System.out.println(getSortedUniqueIntegersDESC(integersList));
        System.out.println("------------------------------");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Привет");
        stringList2.add("Мир");
        stringList2.add("Привет");
        stringList2.add("!");
        stringList2.add("!");
        System.out.println(buildSentenceDirection(stringList2));

    }


    public static void convertToUnique(List<String> stringList) {
        Set<String> uniqueString = new HashSet<>(stringList);
        stringList.clear();
        stringList.addAll(uniqueString);
    }
    public static Set<Integer> getSortedUniqueIntegersASC(List<Integer> integersList) {
        Set<Integer> sortedUniqueIntegersASC = new TreeSet<>();
        sortedUniqueIntegersASC.addAll(integersList);
        return sortedUniqueIntegersASC;
    }
public static Set<Integer>getSortedUniqueIntegersDESC(List<Integer>integerList){
        Set<Integer>temp = new TreeSet<>();
        temp.addAll(integerList);
        Set<Integer>sortedUniqueIntegersDESC = new LinkedHashSet<>();
    for (int i = temp.size();i>0;i--){
        sortedUniqueIntegersDESC.add(i);
        }return sortedUniqueIntegersDESC;
}
    public static Set<String> buildSentenceDirection(List<String> stringList2) {
        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.addAll(stringList2);
        return stringLinkedHashSet;
    }
}