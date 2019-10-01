package com.stackroute.domain;
public class Actor {
   public Actor(String name, String gender, int age) {
       this.name = name;
       this.gender = gender;
       this.age = age;
   }    String name;
   String gender;
    int age;     public void setName(String name) {
       this.name = name;
   }    public void setGender(String gender) {
       this.gender = gender;
   }    public void setAge(int age) {
       this.age = age;
   }    public void prints()
   {
           System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
         //  System.out.print(" ");
   }
}