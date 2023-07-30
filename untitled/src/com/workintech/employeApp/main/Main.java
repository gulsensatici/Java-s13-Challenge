package com.workintech.employeApp.main;

import com.workintech.employeApp.enums.Plan;
import com.workintech.employeApp.model.Employee;
import com.workintech.employeApp.model.Healthplan;

public class Main {
    public static void workWithData() {
        Healthplan plan1=new Healthplan(1,"x Sigorta", Plan.ADVANCE);
        Healthplan plan2=new Healthplan(2,"y Sigorta", Plan.NORMAL);

        String[] healthplans= new String[3];
        healthplans[0]=plan1.getName();
        healthplans[1]=plan2.getName();

        Employee developer = new Employee(1, "gulsen satici","gulsensatici@com", "1234");

        System.out.println(developer);
    }
    public class Main {
        public static void main(String []args){


        }
    }
}