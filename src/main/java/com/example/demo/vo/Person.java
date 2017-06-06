package com.example.demo.vo;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Person {

    private int Id;

    private String name;

    private int age;

    private String address;

    public Person(int id, String name, int age, String address) {
        super();
        Id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        super();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
