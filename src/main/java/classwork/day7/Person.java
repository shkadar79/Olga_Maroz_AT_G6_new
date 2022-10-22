package main.java.classwork.day7;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private int growth;
    private int weight;

    public Person(String name, int age, int growth, int weight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
