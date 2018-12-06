package com.company;

import java.util.ArrayList;
import java.util.List;


public class EmployementHistory extends EducationDetail{

    String experience;
    String organization;
    String duration ;
    int project_work;

    public void set_experience( String experience)
    {
        this.experience =experience;

    }
    public void set_organization( String organization)
    {
        this.organization =organization;

    }

    public void set_duration( String duration)
    {

        this.duration =duration;


    }
    public void set_project_work( int project_work)
    {
        this.project_work=project_work;

    }
    public String get_experience( )
    {
        return experience;
    }
    public String get_organization( )
    {
        return organization;

    }

    public String get_duration()
    {

        return duration;


    }
    public int get_project_work()
    {
        return project_work;

    }

    public String toString() {
        return this.age + " " + this.name+" "+this.designation+" "+this.degree_diploma+" "+this.percentage+" "+this.date+" "+this.experience+" "+this.organization+" "+this.duration+" "+this.project_work;
    }




}



