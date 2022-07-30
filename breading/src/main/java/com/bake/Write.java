package com.bake;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    
    public static void Open(){
        System.out.println("Hello");
        try {
            FileWriter fw = new FileWriter("inventroy.csv");
            fw.write("test");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public void addIngredient(Ingredient ing){

    }

    public void deleteIngredient(Ingredient ing){

    }

    public void changeAmount(Ingredient ing, int grams){
        ing.setSupply(ing.getSupply() + grams);
        
    }
}
