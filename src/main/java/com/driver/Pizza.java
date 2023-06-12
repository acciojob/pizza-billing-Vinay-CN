package com.driver;

import javax.lang.model.util.ElementScanner14;

public class Pizza {

    private int price=0;
    private boolean isVeg=true;
    private String bill="";
    private boolean isCheeseAdded=false;
    private boolean isToppingAdded=false;
    private boolean TakeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(isVeg)
        {
            price+=300;
            bill=bill+"Base Price of Pizza : 300/n";
        }
        else{
            price+=400;
            bill=bill+"Base Price of Pizza : 400/n";
        }
        
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded==false)
        {
            this.isCheeseAdded=true;
            price=price+80;
            bill=bill+"extracheese :added:80/n";
        }

    }

    public void addExtraToppings(){
      if(isToppingAdded==false)
      {
        if(isVeg==true)
        {
            price+=100;
            bill=bill+"extra toppings Added : 100 /n";
        }
        else{
            price+=150;
            bill=bill+"price of extra toppings : 150 /n";
        }
        isToppingAdded=true;
      }
    }

    public void addTakeaway(){
        if(TakeAway==false)
        {
            price+=20;
            bill=bill+"price of takeaway : 20/n";
            TakeAway=true;
        }
    }

    public String getBill(){
    
        return this.bill+"Total bill : "+this.price;
    }
}
