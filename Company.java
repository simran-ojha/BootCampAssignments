package com.company;

import com.company.EmployementHistory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Company  {


    private static ArrayList<EmployementHistory> employementHistoryList;


    public static void main(String[] args) {

        EmployementHistory eh[] = new EmployementHistory[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of data you want to insert");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the age of employee");
            int age = sc.nextInt();
            System.out.println("Enter the name of employee");
            String name = sc.next();
            System.out.println("Enter the Designation of employee");
            String desig = sc.next();

//************************################################$$$$$$$$$$$$$$$$$$$$$$$$$$$*****************************%%%%%%%%%%%%
            System.out.println("Enter the Degree/Diploma name of employee");
            String deg_dip = sc.next();
            System.out.println("Enter the percentage of employee");
            double per = sc.nextDouble();
            System.out.println("Enter the date of employee");
            String date = sc.next();

//**************************######################################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$%%%%%%%%%%%%%%%%************
            System.out.println("Enter if employee has work Experience");
            String w_exp = sc.next();
            System.out.println("Enter the Organization name of the employee");
            String org = sc.next();
            System.out.println("Enter the Duration of employee");
            String dur = sc.next();
            System.out.println("Enter the Project worked of employee");
            int pr_w = sc.nextInt();
            eh[i] = new EmployementHistory();
            eh[i].set_age(age);
            eh[i].set_name(name);
            eh[i].set_designation(desig);
            eh[i].get_age();
            eh[i].get_name();
            eh[i].get_designation();
            //**************@@@@@@@@@@@@@@@@@@@@@@####$%^^^^^^^^^^^^^^^^^^^^^^^^^$#@@@@@@@@@@@@@@@@@@@@@@@@@@2
            eh[i].set_education_degree_diploma(deg_dip);
            eh[i].set_percentage(per);
            eh[i].set_date(date);
            eh[i].get_education_degree_diploma();
            eh[i].get_percentage();
            eh[i].get_date();
            //@@@@@@@@@@@@@@@@@@@@#######################$$$$$$$$$$$$$$$$$$$$$%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
            eh[i].set_experience(w_exp);
            eh[i].set_organization(org);
            eh[i].set_duration(dur);
            eh[i].set_project_work(pr_w);
            eh[i].get_experience();
            eh[i].get_organization();
            eh[i].get_duration();
            eh[i].get_project_work();
            employementHistoryList = new ArrayList<EmployementHistory>();
            employementHistoryList.add(eh[i]);

//*******************************%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################2##################@@@@@@@@@@@@@@@@@

            Company c = new Company();
            c.emp_Developer();
            c.emp_Developer_Experience();
            c.emp_WorkedOrganization();
        }
    }

    }
     public void emp_Developer( ArrayList<EmployementHistory> emplist) {

        for (EmployementHistory emp: emplist) {
            if (emp.designation.equalsIgnoreCase("Developer")) {

                System.out.println(emp.toString());

            }
        }
    }

     public void emp_WorkedOrganization( ArrayList<EmployementHistory> emplist) {
        for (EmployementHistory emp: emplist) {
            if (emp.experience.equalsIgnoreCase("yes")) {

                System.out.println(emp);

            }




        }
    }

     public void emp_Developer_Experience( ArrayList<EmployementHistory> emplist) {
        for (EmployementHistory emp: emplist) {
            if (emp.designation.equalsIgnoreCase("Developer")&& emp.project_work>2) {

                System.out.println(emp);



            }
        }

    }

}


