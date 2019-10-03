package com.stackroute.domain;public class Actor {
   String name;
   String gender;
   int age;    public Actor(String name, String gender, int age) {
       this.name = name;
       this.gender = gender;
       this.age = age;
   }    public Actor() {
   }

 public void print() {
       System.out.println("Name:" + name + "gender:" + gender + "Age:" + age);
   }
}
