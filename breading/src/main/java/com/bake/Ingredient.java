package com.bake;

public class Ingredient {

    private String name;
    private int supply;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSupply() {
        return supply;
    }
    public void setSupply(int supply) {
        this.supply = supply;
    }
    
    

    Ingredient(String name){
        this.name = name;
        this.supply = 0;
    }

    public void addIngredient(){
        
    }
    

}
