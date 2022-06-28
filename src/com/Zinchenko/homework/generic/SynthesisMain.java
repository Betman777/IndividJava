package com.Zinchenko.homework.generic;
//1. Ящики-фрукты
//
//       1.1 Создать базовый тип Fruit.
//
//       2 Создать типы Apple, Orange что реализовывают тип Fruit.
//
//       3  Создать тип Box. В коробку можно складывать фрукты (динамический массив). Однако, в одну коробку нельзя сложить фрукты разного типа.
//       Например: яблоки с апельсины будет недопустимой комбинацией.
//
//      4. Реализовать метод добавление фрукта (1 ед.) в коробку.
//
//       5. Реализовать метод добавление фруктов (множ.) в коробку.
//
//        6 Реализовать метод getWeight(). Метод высчитывает вес коробки на основании веса одного фрукта и его количества.
//       Вес: яблока - 1.0F, апельсина - 1.5F.
//
//       7 В классе Box реализовать метод compare. Метод производит сравнение текущую коробки с переденной в качестве параметра.
//       Возвращать true - если их веса равны, в противном случае - выбросить Исключение
//       ВАЖНО! Можно сравнивать коробки содержащие различные фрукты. Так, коробки с яблоками возможно сравнивать с коробками с апельсинами и так далее.
//
//       8 Реализовать метод merge. Метод выполняет пересыпание из переданной коробки в качестве параметра, в текущую.
//      Однако, стоит учитывать, что в одну коробку нельзя сложить фрукты разного типа.

public class SynthesisMain {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();

        box1.addOneFruit(apple);
        box2.addOneFruit(orange);
        box3.addOneFruit(orange);

        box1.addManyFruit(apple, apple, apple);
        box2.addManyFruit(orange, orange);
        box3.addManyFruit(orange, orange, orange, orange);

        System.out.println("Weight box1 : " + box1.getWeight());
        System.out.println("Weight box2 : " + box2.getWeight());
        System.out.println("Weight box3 : " + box3.getWeight());

        try {
            box2.compare(box3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }

        box2.merge(box3);
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
    }
}
