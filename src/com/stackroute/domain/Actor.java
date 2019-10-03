package com.stackroute.domain;
//com.stackroute.domain.Actor
public class Actor {
   String name;
   String gender;
   int age;    public Actor(String name, String gender, int age) {
       this.name = name;
       this.gender = gender;
       this.age = age;
   }//    @Override
//    public String toString() {
//        return "Actor{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                '}';
//    }  
   public void setName(String name) {
       this.name = name;
   }    public void setGender(String gender) {
       this.gender = gender;
   }    public void setAge(int age) {
       this.age = age;
   }
   public void print() {
       System.out.println("Name:"+name + "gender:"+ gender+"Age:"+age);
   }
}