package com.company;

import java.util.ArrayList;
import java.util.List;


public class Employee {

    int age;
    String designation;
    String name;


    public void set_age(int age)  {

        this.age = age;


    }
    public void set_name(String name){
        this.name = name;

    }
    public void set_designation(String designation){
        this.designation = designation;

    }
    public int get_age(){
        return age;
    }
    public String get_name(){
        return name;
    }
    public String get_designation(){
        return designation;
    }



}


