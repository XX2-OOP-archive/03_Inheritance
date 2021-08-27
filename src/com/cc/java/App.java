package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
      Cat cat  = new Cat("Grizabella", "white", 29);

      ausgabe("Name: " + cat.getStringAttributes("#name"));
      ausgabe("Fellfarbe: " + cat.getStringAttributes("#color"));
      
      ausgabe("Alter: " + cat.getAge());
      ausgabe("Alter: " + cat.getAge());
      ausgabe("Alter: " + cat.getAge());
      ausgabe("Alter: " + cat.getAge());
    
      ausgabe("--------------------");

      Tomcat tomcat  = new Tomcat("Alonzo", "grey", 35);
      
      ausgabe("Name: " + tomcat.getStringAttributes("#name"));
      ausgabe("Fellfarbe: " + tomcat.getStringAttributes("#color"));
      
      ausgabe("Alter: " + tomcat.getAge());
  
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }

}
