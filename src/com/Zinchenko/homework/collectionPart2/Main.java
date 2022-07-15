package com.Zinchenko.homework.collectionPart2;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("first", 32, "/path/to/file1");
        FileData file2 = new FileData("second", 64, "/path/to/file2");
        FileData file3 = new FileData("first2", 16, "/path/to/file1");
        FileData file4 = new FileData("second2", 128, "/path/to/file2");
        FileData file5 = new FileData("test", 64, "/path/to/file3");
        FileData file6 = new FileData("test", 64, "/path/my/file");

        fileNavigator.add("/path/to/file1", file1);
        fileNavigator.add("/path/to/file2", file2);
        fileNavigator.add("/path/to/file1", file3);
        fileNavigator.add("/path/to/file2", file4);
        fileNavigator.add("/path/to/file3", file5);

        System.out.println("/path/to/file1");
        System.out.println(fileNavigator.find("/path/to/file1"));
        System.out.println("Find /path/to/file2");
        System.out.println(fileNavigator.find("/path/to/file2"));

        System.out.println("FilterBySize 64:");
        System.out.println(fileNavigator.filterBySize(64));
        System.out.println("FilterBySize 63:");
        System.out.println(fileNavigator.filterBySize(63));

        System.out.println("SortBySize:");
        System.out.println(fileNavigator.sortBySize());

        System.out.println("FileNavigator before delete:");
        System.out.println(fileNavigator);
        System.out.println("FileNavigator after delete:");
        fileNavigator.remove("/path/to/file2");
        System.out.println(fileNavigator);

        System.out.println("Add file with invalid path: ");
        fileNavigator.add("/path/to/file", file6);
    }
}

