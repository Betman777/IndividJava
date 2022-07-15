package com.Zinchenko.homework.collectionPart2;

public record FileData(String name, int sizeByte, String path) implements Comparable<FileData> {

    public Integer getSizeByte() {
        return sizeByte;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", sizeByte=" + sizeByte +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public int compareTo(FileData file) {
        return this.getSizeByte() - file.getSizeByte();
    }
}