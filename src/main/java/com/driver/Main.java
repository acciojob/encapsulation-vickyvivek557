package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
//      obj.name = "Vivek";
//      System.out.println(name);
      //Error: name has private access in com.driver.RWOnly
        obj.setName("Vivek");
        String name = obj.getName();
  }
}