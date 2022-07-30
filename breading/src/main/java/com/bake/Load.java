package com.bake;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Load {

    public static void Load() throws FileNotFoundException{
        String line;
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");
                Ingredient newIng = new Ingredient(data[0]);
                newIng.setSupply(Integer.parseInt(data[1]));
                App.ingredients.add(newIng);
            }
        
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    

}
