package com.nioexample;

public class Student {
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toFileFormat(){
        //  return "name="+name+"<##>age="+age;
        return "name="+name+"<##>age="+age+"<#>";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
