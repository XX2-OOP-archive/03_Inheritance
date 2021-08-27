package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29, true);

      ausgabe("Name: " + cat1.getStringAttributes("#name"));
      ausgabe("Fellfarbe: " + cat1.getStringAttributes("#color"));
      
      ausgabe("Alter: " + cat1.getAge());
      ausgabe("Alter: " + cat1.getAge());
      ausgabe("Alter: " + cat1.getAge());
      ausgabe("Alter: " + cat1.getAge());
    
    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35, false);
      
      ausgabe("Name: " + cat2.getStringAttributes("#name"));
      ausgabe("Fellfarbe: " + cat2.getStringAttributes("#color"));
      
      ausgabe("Alter: " + cat2.getAge());
      ausgabe("Alter: " + cat2.getAge());
      ausgabe("Alter: " + cat2.getAge());

    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }

}
