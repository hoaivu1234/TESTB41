package com.vti.entity.inheritance.QS3;

public abstract class Student extends Person {
    private int id;
    public Student(String name,int id) {
        super(name);
        this.id=id;
    }
}
