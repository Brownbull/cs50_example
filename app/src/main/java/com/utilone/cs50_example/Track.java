package com.utilone.cs50_example;

public class Track {
    public String name;
    public String instructor;

    Track(String name, String instructor){
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
