package com.driver;

public class Main {
  public static void main(String[] args) {
  var dp=new DeluxePizza(false);
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    System.out.println(p.getPrice());
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}