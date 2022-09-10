package com.nioexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("C:\\Users\\User\\Desktop\\Vimukhi ayya\\JavaNIO\\NIOExample\\src\\myfile.txt");

            Student student = new Student("Vimukthi H",30);
            Student std2 = new Student("Kasun",25);
            fileHandler.WriteFile(student);
            fileHandler.WriteFile(std2);
            System.out.println(fileHandler.ReadFile());

            fileHandler.getStudentByName("Vimukthi H");
            fileHandler.getStudentByName("ABC");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}