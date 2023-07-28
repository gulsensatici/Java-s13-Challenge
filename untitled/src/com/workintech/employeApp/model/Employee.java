package com.workintech.employeApp.model;

public class Employee {
   private int id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthplans;

   public Employee(int id , String fullName, String email,String password ){
       this.id=id;
       this.fullName=fullName;
       this.email=email;
       this.password=password;
       this.healthplans=healthplans;

   }

    public int getId() {
        return id;
    }
    public String getFullName(){
       return fullName;
   }
   public String getEmail(){
       return email;
   }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void  addHealthplan(int index, String name){
       try {
           if (healthplans[index] == null) {
               healthplans[index] = name;

           } else {
               System.out.println("İlgili index için atama yapılmış ");
           }
       }
       catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("Olmayan index çin atama yapıldı");
       }
   }
}
