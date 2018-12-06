package com.company;

import java.util.ArrayList;
import java.util.List;


public class EducationDetail extends Employee{


    String degree_diploma;
    double percentage;
    String date;

    public void set_education_degree_diploma( String degree_diploma)
    {
        this.degree_diploma =degree_diploma;


    }
    public void set_percentage( double percentage)
    {

        this.percentage =percentage;
    }

    public void set_date (String date)
    {
        this.date = date;
    }
    public void set_employeelist(ArrayList<Employee>employeelist){

    }
    public String get_education_degree_diploma()
    {
        return degree_diploma;


    }
    public double get_percentage( )
    {

        return percentage;
    }

    public String get_date ()
    {
        return date;
    }
}



