package com.Zinchenko.homework.collectionPart2;
//0. Создать класс FileNavigator. Класс предназначен для хранения списка файлов, располагаемые по концертному пути.
//        Например: /path/to/file -> [files.txt, firstApp.java]
//
//        1. Создать класс FileData. Класс представляет конкретный файл и состоит из: имя файла, размер в байтах, путь к файлу.
//        2. Реализовать метод add в классе FileNavigator. Данный метод добавляет файл по указанному пути. Если путь уже существует, то новый файл необходимо добавить к списку, уже связанному с соответствующим путем. ВАЖНО: Путь - уникальное значение и не должно повторяться.
//        3. Реализовать метод find в классе FileNavigator. Метод возвращает список файлов связанных с путем переданным в качестве параметра.
//        4. Реализовать метод filterBySize в классе FileNavigator. Метод возвращает список файлов, размер (в байтах) которых не превышает значение переданное в качестве параметра.
//        5. Реализовать метод remove в классе FileNavigator. Метод удаляет путь и связанные с ним файлы, на основании значения пути, переданного в качестве параметра.
//        6. * Реализовать метод sortBySize в классе FileNavigator. Метод сортирует все имеющиеся файлы по их размеру (по возрастанию), затем возвращает список отсортированных файлов.
//        7. ** Реализовать проверку консистентности в методе add в классе FileNavigator. Не позволять добавлять значения и сообщить об этом в консоль, при попытке добавить значение FileData значение пути которого не соответствует пути-ключу ведущему к списку файлов.
//        Например:
//        Должна быть ошибка, поскольку путь-ключ и путь к файлу не совпадают
//        Путь: /path/to/file
//        FileData: {name: ..., size: ..., path: /another/path/}

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    public void add(String path, FileData newFile) {
        if (!path.equals(newFile.getPath())) {
            System.out.println("The path does not match the specified path in the file");
        } else if (files.containsKey(path)) {
            files.get(path).add(newFile);
        } else {
            List<FileData> file = new ArrayList<>();
            file.add(newFile);
            files.put(path, file);
        }
    }

    public List<FileData> find(String findPath) {
        return files.get(findPath);
    }

    public List<FileData> filterBySize(int findSize) {
        List<FileData> result = new ArrayList<>();

        for (List<FileData> allFile : files.values()) {
            for (FileData file : allFile) {
                if (file.getSizeByte() <= findSize) {
                    result.add(file);
                }
            }
        }

        return result;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortFiles = new ArrayList<>();
        for (List<FileData> allFile : files.values()) {
            for (FileData file : allFile) {
                sortFiles.add(file);
            }
        }
        Collections.sort(sortFiles);
        return sortFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
